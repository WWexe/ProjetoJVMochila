import java.util.List;

public class OtimizacaoMochila {
    private Estoque estoque;
    private Mochila mochila;

    public OtimizacaoMochila(Estoque estoque, Mochila mochila) {
        this.estoque = estoque;
        this.mochila = mochila;
    }

    public void otimizar() {
        List<Produto> produtos = estoque.getProdutos();
        // Calcula a densidade (valor / volume) de cada produto e os armazena em um array
        for (Produto produto : produtos) {
            double densidade = produto.getValor() / produto.getVolume();
            produto.setDensidade(densidade);  // Adiciona a densidade no produto
        }

        // Ordena os produtos pela densidade de forma decrescente
        produtos.sort((p1, p2) -> Double.compare(p2.getDensidade(), p1.getDensidade()));

        int volumeRestante = mochila.getVolume();
        double valorTotal = 0;
        int[] quantidadesEscolhidas = new int[produtos.size()];

        // Tenta preencher a mochila com os produtos ordenados
        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            int quantidadeMaxima = Math.min(produto.getQuantidade(), volumeRestante / (int) produto.getVolume());

            quantidadesEscolhidas[i] = quantidadeMaxima;
            volumeRestante -= quantidadeMaxima * produto.getVolume();
            valorTotal += quantidadeMaxima * produto.getValor();

            // Atualiza as quantidades escolhidas no produto
            produto.setQuantidadeEscolhida(quantidadeMaxima);

            // Se a mochila estiver cheia, interrompe o processo
            if (volumeRestante <= 0) break;
        }

        // Exibe os resultados
        exibirResultados(quantidadesEscolhidas, valorTotal);
    }

    private void exibirResultados(int[] quantidadesEscolhidas, double valorTotal) {

    }

    public double getValorTotal() {
        // Calcula o valor total da mochila com base nas quantidades escolhidas
        double valorTotal = 0;
        for (Produto produto : estoque.getProdutos()) {
            valorTotal += produto.getQuantidadeEscolhida() * produto.getValor();
        }
        return valorTotal;
    }
}

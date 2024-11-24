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
        for (Produto produto : produtos) {
            double densidade = produto.getValor() / produto.getVolume();
            produto.setDensidade(densidade);
        }

        produtos.sort((p1, p2) -> Double.compare(p2.getDensidade(), p1.getDensidade()));

        int volumeRestante = mochila.getVolume();
        double valorTotal = 0;
        int[] quantidadesEscolhidas = new int[produtos.size()];

        for (int i = 0; i < produtos.size(); i++) {
            Produto produto = produtos.get(i);
            int quantidadeMaxima = Math.min(produto.getQuantidade(), volumeRestante / (int) produto.getVolume());

            quantidadesEscolhidas[i] = quantidadeMaxima;
            volumeRestante -= quantidadeMaxima * produto.getVolume();
            valorTotal += quantidadeMaxima * produto.getValor();

            produto.setQuantidadeEscolhida(quantidadeMaxima);

            if (volumeRestante <= 0) break;
        }

        exibirResultados(quantidadesEscolhidas, valorTotal);
    }

    private void exibirResultados(int[] quantidadesEscolhidas, double valorTotal) {

    }

    public double getValorTotal() {
        double valorTotal = 0;
        for (Produto produto : estoque.getProdutos()) {
            valorTotal += produto.getQuantidadeEscolhida() * produto.getValor();
        }
        return valorTotal;
    }
}

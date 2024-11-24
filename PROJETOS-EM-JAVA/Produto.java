public class Produto {
    private String nome;
    private double comprimento;
    private double altura;
    private double largura;
    private double volume;
    private int quantidade;
    private double valor;
    private double densidade;

    public Produto(String nome, double comprimento, double altura, double largura, int quantidade, double valor) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
        this.quantidade = quantidade;
        this.valor = valor;
        this.volume = calcularVolume();
        this.densidade = calcularDensidade();
    }

    private double calcularVolume() {
        return comprimento * altura * largura;
    }

    private double calcularDensidade() {
        if (volume != 0) {
            return valor / volume;
        }
        return 0;
    }

    public int getQuantidadeEscolhida() {
        return this.quantidade;
    }

    public void setQuantidadeEscolhida(int quantidadeEscolhida) {
        this.quantidade = quantidadeEscolhida;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
        this.volume = calcularVolume();
        this.densidade = calcularDensidade();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        this.volume = calcularVolume();
        this.densidade = calcularDensidade();
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
        this.volume = calcularVolume();
        this.densidade = calcularDensidade();
    }

    public double getVolume() {
        return volume;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        this.densidade = calcularDensidade();
    }

    public double getDensidade() {
        return densidade;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Quantidade: " + quantidade + ", Valor: R$" + String.format("%.2f", valor)
                + ", Volume: " + String.format("%.2f", volume) + " cm³" + ", Densidade: " + String.format("%.6f", densidade);
    }
}

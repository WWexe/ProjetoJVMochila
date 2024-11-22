public class Produto {
    private String nome;
    private double comprimento;
    private double altura;
    private double largura;
    private int quantidade;
    private double valor;

    public Produto(String nome, double comprimento, double altura, double largura, int quantidade, double valor) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Quantidade: " + quantidade + ", Valor: R$" + String.format("%.2f", valor)
                + ", Comprimento: " + comprimento + " cm, Altura: " + altura + " cm, Largura: " + largura + " cm";
    }
}

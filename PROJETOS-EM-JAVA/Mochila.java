public class Mochila {
    private int comprimento;
    private int altura;
    private int largura;
    private int volume;  // Declaração correta da variável volume

    public Mochila(int comprimento, int altura, int largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
        this.volume = calcularVolume();  // Calcula o volume automaticamente
    }

    private int calcularVolume() {
        return comprimento * altura * largura;  // Cálculo do volume
    }

    public int getComprimento() {
        return comprimento;
    }

    public int getAltura() {
        return altura;
    }

    public int getLargura() {
        return largura;
    }

    public int getVolume() {
        return volume;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
        this.volume = calcularVolume();  // Atualiza o volume
    }

    public void setAltura(int altura) {
        this.altura = altura;
        this.volume = calcularVolume();  // Atualiza o volume
    }

    public void setLargura(int largura) {
        this.largura = largura;
        this.volume = calcularVolume();  // Atualiza o volume
    }

    @Override
    public String toString() {
        return "Mochila{" +
                "comprimento=" + comprimento +
                ", altura=" + altura +
                ", largura=" + largura +
                ", volume=" + volume +  // Adicionando volume na representação
                '}';
    }
}

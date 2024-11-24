public class Mochila {
    private int comprimento;
    private int altura;
    private int largura;
    private int volume;

    public Mochila(int comprimento, int altura, int largura) {
        this.comprimento = comprimento;
        this.altura = altura;
        this.largura = largura;
        this.volume = calcularVolume();
    }

    private int calcularVolume() {
        return comprimento * altura * largura;
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
        this.volume = calcularVolume();
    }

    public void setAltura(int altura) {
        this.altura = altura;
        this.volume = calcularVolume();
    }

    public void setLargura(int largura) {
        this.largura = largura;
        this.volume = calcularVolume();
    }

    @Override
    public String toString() {
        return "Mochila{" +
                "comprimento=" + comprimento +
                ", altura=" + altura +
                ", largura=" + largura +
                ", volume=" + volume +
                '}';
    }
}

public class Mochila {
    private int mochilaComprimento;
    private int mochilaAltura;
    private int mochilaLargura;

    public Mochila(int mochilaComprimento, int mochilaAltura, int mochilaLargura) {
        this.mochilaComprimento = mochilaComprimento;
        this.mochilaAltura = mochilaAltura;
        this.mochilaLargura = mochilaLargura;
    }
    public int getMochilaComprimento() {
        return mochilaComprimento;
    }
    public int getMochilaAltura() {
        return mochilaAltura;
    }
    public int getMochilaLargura() {
        return mochilaLargura;
    }
    public void setMochilaComprimento(int mochilaComprimento) {
        this.mochilaComprimento = mochilaComprimento;
    }
    public void setMochilaAltura(int mochilaAltura) {
        this.mochilaAltura = mochilaAltura;
    }
    public void setMochilaLargura(int mochilaLargura) {
        this.mochilaLargura = mochilaLargura;
    }
    @Override
    public String toString() {
        return "Mochila{" +
                "mochilaComprimento=" + mochilaComprimento +
                ", mochilaAltura=" + mochilaAltura +
                ", mochilaLargura=" + mochilaLargura +
                '}';
    }
}

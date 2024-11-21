import java.time.LocalDateTime;

public class HistoricoAlteracao {
    private String operacao;
    private String nomeProduto;
    private String descricao;
    private LocalDateTime dataHora;

    public HistoricoAlteracao(String operacao, String nomeProduto, String descricao) {
        this.operacao = operacao;
        this.nomeProduto = nomeProduto;
        this.descricao = descricao;
        this.dataHora = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return "Operação: " + operacao +
                ", Produto: " + nomeProduto +
                ", Descrição: " + descricao +
                ", Data/Hora: " + dataHora;
    }
}

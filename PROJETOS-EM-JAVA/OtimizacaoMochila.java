import java.util.ArrayList;
import java.util.List;

public class OtimizacaoMochila {

    public static List<Produto> otimizarEstoque(List<Produto> produtos, int capacidade) {
        int n = produtos.size();
        int[][] dp = new int[n + 1][capacidade + 1];
        List<Produto> resultado = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            Produto produto = produtos.get(i - 1);
            for (int w = 1; w <= capacidade; w++) {
                if (produto.getQuantidade() <= w) {
                    dp[i][w] = (int) Math.max(produto.getValor() + dp[i - 1][w - produto.getQuantidade()], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        int w = capacidade;
        for (int i = n; i > 0 && w > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                Produto produto = produtos.get(i - 1);
                resultado.add(produto);
                w -= produto.getQuantidade();
            }
        }
        return resultado;
    }
}
import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {
    private List<Produto> produtos = new ArrayList<>();

    public void salvarProduto(Produto produto) {
        produtos.add(produto);
    }

    public boolean removerProduto(String nome) {
        return produtos.removeIf(produto -> produto.getNome().equals(nome));
    }

    public boolean atualizarProduto(String nome, Produto produtoAtualizado) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getNome().equals(nome)) {
                produtos.set(i, produtoAtualizado);
                return true;
            }
        }
        return false;
    }

    public List<Produto> recuperarProdutos() {
        return produtos;
    }

    public List<Produto> visualizarProdutos() {
        return produtos;
    }
}

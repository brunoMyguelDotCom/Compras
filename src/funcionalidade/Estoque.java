package funcionalidade;

import java.util.ArrayList;
import java.util.List;

public class Estoque implements Infos {
    private List<Produto> listaDeProdutosNoEstoque;
    private int numeroDeItensNoEstoque;

    public Estoque() {
        this.numeroDeItensNoEstoque = 0;
        this.listaDeProdutosNoEstoque = new ArrayList<>();
    }

    public void adicionarItemNoEstoque(Produto itemAdicionadoNoEstoque) {
        listaDeProdutosNoEstoque.add(itemAdicionadoNoEstoque);
        System.out.println("ITEM (" + itemAdicionadoNoEstoque.getNome() + " " + itemAdicionadoNoEstoque.getMarca() + ") ADICIONADO AO ESTOQUE! \n QUANTIDADE ADICIONADA: " + itemAdicionadoNoEstoque.getQuantitdadeDoProdutoEmEstoque() + "\n");
    }

    public void removerItemNoEstoque(Produto itemRemovidoNoEstoque) {
        listaDeProdutosNoEstoque.remove(itemRemovidoNoEstoque);
        System.out.println("ITEM (" + itemRemovidoNoEstoque.getNome() + " " + itemRemovidoNoEstoque.getMarca() + ") REMOVIDO DO ESTOQUE! \n QUANTIDADE REMOVIDA: " + itemRemovidoNoEstoque.getQuantitdadeDoProdutoEmEstoque() + "\n");
    }

    public int getNumeroDeItensNoEstoque() {
        numeroDeItensNoEstoque = 0;
        for (int i = 0; i < listaDeProdutosNoEstoque.size(); i++) {
            numeroDeItensNoEstoque += listaDeProdutosNoEstoque.get(i).getQuantitdadeDoProdutoEmEstoque();
        }
        return numeroDeItensNoEstoque;
    }

    public void exibeInfos() {
        System.out.println("Número de Itens no Estoque: " + getNumeroDeItensNoEstoque());
    }
}

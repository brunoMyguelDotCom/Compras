package funcionalidade;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private int quantidadeDeItensNoCarrinho;
    private double valorTotalNoCarrinho;
    private List<Produto> listaDeProdutosNoCarrinho;

    public Carrinho() {
        this.quantidadeDeItensNoCarrinho = 0;
        this.valorTotalNoCarrinho = 0;
        this.listaDeProdutosNoCarrinho = new ArrayList<>();
    }

    public int getQuantidadeDeItensNoCarrinho() {
        return quantidadeDeItensNoCarrinho;
    }

    public double getValorTotalNoCarrinho() {
        return valorTotalNoCarrinho;
    }

    public List<Produto> getListaDeProdutosNoCarrinho() {
        return listaDeProdutosNoCarrinho;
    }

    public void adicionarItemAoCarrinho(Produto itemAdicionadoAoCarrinho) {
        itemAdicionadoAoCarrinho.setQuantitdadeDoProdutoEmEstoque(itemAdicionadoAoCarrinho.getQuantitdadeDoProdutoEmEstoque() - 1);
        listaDeProdutosNoCarrinho.add(itemAdicionadoAoCarrinho);
        quantidadeDeItensNoCarrinho += 1;
        this.valorTotalNoCarrinho += itemAdicionadoAoCarrinho.getPrecoDeVenda();

        itemAdicionadoAoCarrinho.setQuantitdadeDoProdutoEmEstoque(itemAdicionadoAoCarrinho.getQuantitdadeDoProdutoEmEstoque() - 1);

        System.out.println("ITEM: " + itemAdicionadoAoCarrinho.getNome() + " ADICIONADO AO SEU CARRINHO!\n");
    }

    public void removerItemDoCarrinho(Produto itemRemovidoDoCarrinho) {
        if (listaDeProdutosNoCarrinho.contains(itemRemovidoDoCarrinho)) {
            itemRemovidoDoCarrinho.setQuantitdadeDoProdutoEmEstoque(itemRemovidoDoCarrinho.getQuantitdadeDoProdutoEmEstoque() + 1);
            listaDeProdutosNoCarrinho.remove(itemRemovidoDoCarrinho);
            quantidadeDeItensNoCarrinho -= 1;
            this.valorTotalNoCarrinho -= itemRemovidoDoCarrinho.getPrecoDeVenda();

            itemRemovidoDoCarrinho.setQuantitdadeDoProdutoEmEstoque(itemRemovidoDoCarrinho.getQuantitdadeDoProdutoEmEstoque() + 1);
            System.out.println("ITEM: " + itemRemovidoDoCarrinho.getNome() + " REMOVIDO DO SEU CARRINHO!\n");

        } else {
            System.out.println("ITEM: " + itemRemovidoDoCarrinho.getNome() + " NÃO ESTÁ EM SEU CARRINHO!\n");
        }
    }

    public void exibeCarrinho() {
        System.out.println("Itens no carrinho: \n" + getListaDeProdutosNoCarrinho() + "\n");
        System.out.println("Quantidade de itens no carrinho: \n" + getQuantidadeDeItensNoCarrinho() + "\n");
        System.out.println("Valor total no carrinho: \n" + "R$ " + getValorTotalNoCarrinho() + "\n");
    }
}

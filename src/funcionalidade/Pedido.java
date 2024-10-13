package funcionalidade;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Infos {
    private int numeroDoPedido;
    private double valorTotalDoPedido;
    private int quantidadeDeItensNoPedido;
    private List<Produto> listaDeProdutos;

    public Pedido() {
        this.numeroDoPedido = 0;
        this.valorTotalDoPedido = 0;
        this.listaDeProdutos = new ArrayList<>();
    }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public void setNumeroDoPedido(int numeroDoPedido) {
        this.numeroDoPedido = numeroDoPedido;
    }

    public double getValorTotalDoPedido() {
        return valorTotalDoPedido;
    }

    public int getQuantidadeDeItensNoPedido() {
        return quantidadeDeItensNoPedido;
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void criaPedido(Carrinho carrinhoParaCriarPedido) {
        this.quantidadeDeItensNoPedido = carrinhoParaCriarPedido.getQuantidadeDeItensNoCarrinho();
        this.valorTotalDoPedido = carrinhoParaCriarPedido.getValorTotalNoCarrinho();
        this.listaDeProdutos = carrinhoParaCriarPedido.getListaDeProdutosNoCarrinho();
    }

    @Override
    public void exibeInfos() {
        System.out.printf("""
                
                Número do pedido: %d
                Quantidade total de itens no pedido: %d
                Valor total do pedido: R$%.2f
                %n""", getNumeroDoPedido(), getQuantidadeDeItensNoPedido(), getValorTotalDoPedido());
        System.out.println("Produtos no pedido: " + getListaDeProdutos() + "\n");
    }

    @Override
    public String toString() {
        return "\nNúmero do pedido: " + getNumeroDoPedido() + "\n" + "Valor total do pedido: R$" + getValorTotalDoPedido() + "\n" + "Lista de produtos no pedido: " + getListaDeProdutos() + "\n";
    }
}


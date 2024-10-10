package funcionalidade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pedido implements Infos {
    private Random random = new Random();
    private int numeroDoPedido;
    private double valorTotalDoPedido;
    private List<Produto> listaDeProdutos;

    public Pedido(Carrinho carrinhoParaPedido) {
        numeroDoPedido = random.nextInt(100);

        this.valorTotalDoPedido = carrinhoParaPedido.getValorTotalNoCarrinho();

        this.listaDeProdutos = new ArrayList<>();
        listaDeProdutos = carrinhoParaPedido.getListaDeProdutosNoCarrinho();
    }

    public int getNumeroDoPedido() {
        return numeroDoPedido;
    }

    public double getValorTotalDoPedido() {
        return valorTotalDoPedido;
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public void exibeInfos() {
        System.out.println("""
                NÚMERO DO PEDIDO: %d
                VALOR TOTAL DO PEDIDO: R$%.2f
                """.formatted(getNumeroDoPedido(), getValorTotalDoPedido()));
        System.out.println("PRODUTOS NO PEDIDO: \n" + getListaDeProdutos());
    }
}

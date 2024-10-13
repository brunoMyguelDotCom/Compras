package funcionalidade;

import java.util.List;

public class Cliente implements Infos {
    private String nome;
    private String endereco;
    private String email;
    private String senha;

    private Carrinho carrinho;
    private List<Pedido> listaDePedidosDoCliente;

    public Cliente() {
        this.nome = "nome";
        this.email = "email";
        this.endereco = "endereco";
        this.senha = "senha";
        this.carrinho = new Carrinho();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void addAoCarrinho(Produto produtoComprar) {
        this.carrinho.adicionarItemAoCarrinho(produtoComprar);
    }

    public void concluiCompra(){
        Pedido pedidoDoCliente = new Pedido();
        pedidoDoCliente.criaPedido(carrinho);

        listaDePedidosDoCliente.add(pedidoDoCliente);
    }

    @Override
    public void exibeInfos() {
        System.out.printf("""
                Nome: %s
                Email: %s
                Endereço: %s
                %n""", getNome(), getEmail(), getEndereco());
    }
}

package funcionalidade;

public class Produto implements Infos{
    private String nome;
    private String cor;
    private String tamanho;
    private String material;
    private String marca;
    private double precoDeVenda;
    private int quantitdadeDoProdutoEmEstoque;

    public Produto(String nome, String cor, String tamanho, String material, String marca, double precoDeVenda, int quantitdadeDoProdutoEmEstoque) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
        this.material = material;
        this.marca = marca;
        this.precoDeVenda = precoDeVenda;
        this.quantitdadeDoProdutoEmEstoque = quantitdadeDoProdutoEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getMaterial() {
        return material;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecoDeVenda() {
        return precoDeVenda;
    }

    public int getQuantitdadeDoProdutoEmEstoque() {
        return quantitdadeDoProdutoEmEstoque;
    }

    public void setQuantitdadeDoProdutoEmEstoque(int quantitdadeDoProdutoEmEstoque) {
        this.quantitdadeDoProdutoEmEstoque = quantitdadeDoProdutoEmEstoque;
    }

    public void exibeInfos() {
        System.out.printf("""
                DESCRIÇÃO DO PRODUTO:
                Nome: %s
                Cor: %s
                Tamanho: %s
                Material: %s
                Marca: %s
                Preço de venda: R$ %.2f
                %n""", getNome(), getCor(), getTamanho(), getMaterial(), getMarca(), getPrecoDeVenda());
    }

    @Override
    public String toString() {
        return "~ " + getNome() + " " + getMarca() + " || "  + getTamanho() + " || R$ " + getPrecoDeVenda();
    }
}

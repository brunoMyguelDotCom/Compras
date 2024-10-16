import funcionalidade.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente;

        Carrinho meuCarrinho1 = new Carrinho();
        Carrinho meuCarrinho2 = new Carrinho();
        Pedido meuPedido1 = new Pedido();
        Pedido meuPedido2 = new Pedido();

        Estoque meuEstoque = new Estoque();

        List<Pedido> listaDePedidos;
        List<Cliente> listaDeClientes = new ArrayList<>();


        //CRIAÇÃO DE PRODUTOS
        Produto camisetaNike = new Produto("Camiseta", "Preta", "XG", "Algodão", "Nike", 95.90, 10);
        Produto camisetaAdidas = new Produto("Camiseta", "Branca", "M", "Poliéster", "Adidas", 79.90, 15);
        Produto calcaLevis = new Produto("Calça", "Azul", "G", "Jeans", "Levi's", 159.90, 8);
        Produto jaquetaPuma = new Produto("Jaqueta", "Verde", "P", "Nylon", "Puma", 199.90, 5);
        Produto bermudaFila = new Produto("Bermuda", "Cinza", "GG", "Moletom", "Fila", 89.90, 12);
        Produto camisetaReebok = new Produto("Camiseta", "Vermelha", "G", "Algodão", "Reebok", 85.00, 18);
        Produto camisetaUnderArmour = new Produto("Camiseta", "Azul", "P", "Dry Fit", "Under Armour", 110.00, 7);
        Produto calcaDiesel = new Produto("Calça", "Preta", "GG", "Jeans", "Diesel", 210.50, 6);
        Produto jaquetaTheNorthFace = new Produto("Jaqueta", "Azul", "M", "Nylon", "The North Face", 250.00, 3);
        Produto bermudaOakley = new Produto("Bermuda", "Preta", "G", "Poliéster", "Oakley", 95.00, 14);
        Produto camisetaConverse = new Produto("Camiseta", "Cinza", "M", "Algodão", "Converse", 70.00, 20);
        Produto calcaWrangler = new Produto("Calça", "Bege", "XG", "Sarja", "Wrangler", 180.00, 9);
        Produto jaquetaColumbia = new Produto("Jaqueta", "Preta", "G", "Fleece", "Columbia", 220.00, 4);
        Produto bermudaHurley = new Produto("Bermuda", "Azul", "GG", "Moletom", "Hurley", 85.50, 10);
        Produto camisetaVans = new Produto("Camiseta", "Verde", "P", "Algodão", "Vans", 75.00, 13);
        Produto calcaLee = new Produto("Calça", "Cinza", "G", "Jeans", "Lee", 165.90, 5);
        Produto jaquetaPatagonia = new Produto("Jaqueta", "Vermelha", "M", "Poliéster", "Patagonia", 270.00, 2);
        Produto bermudaQuiksilver = new Produto("Bermuda", "Verde", "M", "Dry Fit", "Quiksilver", 95.00, 11);
        Produto camisetaNewBalance = new Produto("Camiseta", "Roxa", "XG", "Algodão", "New Balance", 80.00, 12);
        Produto calcaGuess = new Produto("Calça", "Marrom", "M", "Sarja", "Guess", 190.00, 6);
        Produto jaquetaNorthFace = new Produto("Jaqueta", "Cinza", "G", "Nylon", "The North Face", 260.00, 3);
        Produto bermudaBillabong = new Produto("Bermuda", "Laranja", "G", "Poliéster", "Billabong", 99.00, 9);
        Produto camisetaVolcom = new Produto("Camiseta", "Amarela", "P", "Algodão", "Volcom", 70.00, 16);
        Produto calcaRalphLauren = new Produto("Calça", "Branca", "GG", "Jeans", "Ralph Lauren", 240.00, 5);
        Produto jaquetaBurton = new Produto("Jaqueta", "Azul", "XG", "Nylon", "Burton", 300.00, 2);
        Produto bermudaRipCurl = new Produto("Bermuda", "Roxa", "M", "Moletom", "Rip Curl", 89.90, 14);
        Produto camisetaChampion = new Produto("Camiseta", "Rosa", "G", "Algodão", "Champion", 75.00, 18);
        Produto calcaTommyHilfiger = new Produto("Calça", "Preta", "M", "Jeans", "Tommy Hilfiger", 230.00, 4);
        Produto jaquetaSpyder = new Produto("Jaqueta", "Branca", "G", "Nylon", "Spyder", 350.00, 1);
        Produto bermudaOceano = new Produto("Bermuda", "Verde Limão", "GG", "Dry Fit", "Oceano", 95.00, 13);
        Produto camisetaEllus = new Produto("Camiseta", "Marrom", "XG", "Algodão", "Ellus", 85.00, 11);
        Produto calcaCavalera = new Produto("Calça", "Cinza Escuro", "G", "Sarja", "Cavalera", 190.00, 6);
        Produto jaquetaVolcom = new Produto("Jaqueta", "Laranja", "M", "Nylon", "Volcom", 280.00, 3);
        Produto bermudaElement = new Produto("Bermuda", "Bege", "G", "Poliéster", "Element", 89.00, 15);
        Produto camisetaReserva = new Produto("Camiseta", "Azul Marinho", "M", "Algodão", "Reserva", 78.00, 17);
        Produto calcaCalvinKlein = new Produto("Calça", "Verde Militar", "GG", "Jeans", "Calvin Klein", 210.00, 5);
        Produto jaquetaLacoste = new Produto("Jaqueta", "Preta", "G", "Nylon", "Lacoste", 320.00, 2);
        Produto bermudaRoxy = new Produto("Bermuda", "Rosa Claro", "XG", "Dry Fit", "Roxy", 95.00, 10);
        Produto camisetaDC = new Produto("Camiseta", "Vinho", "P", "Algodão", "DC", 72.00, 19);

        //ADIÇÃO DE PRODUTOS NO ESTOQUE
        meuEstoque.adicionarItemNoEstoque(camisetaNike);
        meuEstoque.adicionarItemNoEstoque(camisetaAdidas);
        meuEstoque.adicionarItemNoEstoque(calcaLevis);
        meuEstoque.adicionarItemNoEstoque(jaquetaPuma);
        meuEstoque.adicionarItemNoEstoque(bermudaFila);
        meuEstoque.adicionarItemNoEstoque(camisetaReebok);
        meuEstoque.adicionarItemNoEstoque(camisetaUnderArmour);
        meuEstoque.adicionarItemNoEstoque(calcaDiesel);
        meuEstoque.adicionarItemNoEstoque(jaquetaTheNorthFace);
        meuEstoque.adicionarItemNoEstoque(bermudaOakley);
        meuEstoque.adicionarItemNoEstoque(camisetaConverse);
        meuEstoque.adicionarItemNoEstoque(calcaWrangler);
        meuEstoque.adicionarItemNoEstoque(jaquetaColumbia);
        meuEstoque.adicionarItemNoEstoque(bermudaHurley);
        meuEstoque.adicionarItemNoEstoque(camisetaVans);
        meuEstoque.adicionarItemNoEstoque(calcaLee);
        meuEstoque.adicionarItemNoEstoque(jaquetaPatagonia);
        meuEstoque.adicionarItemNoEstoque(bermudaQuiksilver);
        meuEstoque.adicionarItemNoEstoque(camisetaNewBalance);
        meuEstoque.adicionarItemNoEstoque(calcaGuess);
        meuEstoque.adicionarItemNoEstoque(jaquetaNorthFace);
        meuEstoque.adicionarItemNoEstoque(bermudaBillabong);
        meuEstoque.adicionarItemNoEstoque(camisetaVolcom);
        meuEstoque.adicionarItemNoEstoque(calcaRalphLauren);
        meuEstoque.adicionarItemNoEstoque(jaquetaBurton);
        meuEstoque.adicionarItemNoEstoque(bermudaRipCurl);
        meuEstoque.adicionarItemNoEstoque(camisetaChampion);
        meuEstoque.adicionarItemNoEstoque(calcaTommyHilfiger);
        meuEstoque.adicionarItemNoEstoque(jaquetaSpyder);
        meuEstoque.adicionarItemNoEstoque(bermudaOceano);
        meuEstoque.adicionarItemNoEstoque(camisetaEllus);
        meuEstoque.adicionarItemNoEstoque(calcaCavalera);
        meuEstoque.adicionarItemNoEstoque(jaquetaVolcom);
        meuEstoque.adicionarItemNoEstoque(bermudaElement);
        meuEstoque.adicionarItemNoEstoque(camisetaReserva);
        meuEstoque.adicionarItemNoEstoque(calcaCalvinKlein);
        meuEstoque.adicionarItemNoEstoque(jaquetaLacoste);
        meuEstoque.adicionarItemNoEstoque(bermudaRoxy);
        meuEstoque.adicionarItemNoEstoque(camisetaDC);


        while (true) {

            System.out.println("BEM VINDO AO SISTEMA DE COMPRAS!");
            System.out.println("DIGITE 1 PARA FAZER LOGIN, 2 PARA SE CADASTRAR OU 3 PARA SAIR: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(" ~ LOGIN: \n");

                    System.out.println("Digite seu email: ");
                    String emailLogin = scanner.next();

                    System.out.println("Digite sua senha: ");
                    String senhaLogin = scanner.next();


                    break;
                case 2:
                    cliente = new Cliente();

                    System.out.println("Digite seu nome: ");
                    cliente.setNome(scanner.next());

                    System.out.println("Digite seu email: ");
                    cliente.setEmail(scanner.next());

                    System.out.println("Digite seu endereço: ");
                    cliente.setEndereco(scanner.next());

                    System.out.println("Digite sua senha: ");
                    cliente.setSenha(scanner.next());

                    listaDeClientes.add(cliente);
                    cliente.exibeInfos();

                    System.out.println(listaDeClientes);

                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }

        /*
       //TESTES:
        calcaDiesel.exibeInfos();
        jaquetaBurton.exibeInfos();
        camisetaAdidas.exibeInfos();

        meuCarrinho1.adicionarItemAoCarrinho(calcaDiesel);
        meuCarrinho1.adicionarItemAoCarrinho(jaquetaBurton);
        meuCarrinho1.adicionarItemAoCarrinho(camisetaAdidas);
        meuCarrinho1.removerItemDoCarrinho(camisetaAdidas);

        meuCarrinho1.exibeInfos();

        meuCarrinho2.adicionarItemAoCarrinho(camisetaNike);
        meuCarrinho2.adicionarItemAoCarrinho(jaquetaTheNorthFace);
        meuCarrinho2.exibeInfos();

        System.out.println("***********");
        System.out.println("***********");

        listaDePedidos = new ArrayList<>();
        //TODA VEZ QUE CONCLUIR A COMPRA PRECISA FAZER OS TRES PASSOS:
        meuPedido1.criaPedido(meuCarrinho1);
        meuPedido1.setNumeroDoPedido(listaDePedidos.size() + 1);
        listaDePedidos.add(meuPedido1);

        meuPedido2.criaPedido(meuCarrinho2);
        meuPedido2.setNumeroDoPedido(listaDePedidos.size() + 1);
        listaDePedidos.add(meuPedido2);

        meuPedido1.exibeInfos();
        meuPedido2.exibeInfos();

        System.out.println(listaDePedidos);
    */

    }
}

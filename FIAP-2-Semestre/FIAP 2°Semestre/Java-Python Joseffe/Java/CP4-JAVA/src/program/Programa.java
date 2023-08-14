package program;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import model.Pedido;
import model.Produto;
import java.io.PrintWriter;
import java.util.InputMismatchException;



public class Programa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Pedido> listaPedidos = new ArrayList<Pedido>();

        boolean continuarCadastro = true;
        while (continuarCadastro) {
            System.out.print("Digite o nome do cliente: ");
            String nomeCliente = scanner.nextLine();

            int quantidadeProdutos = 0;
            boolean quantidadeValida = false;
            while (!quantidadeValida) {
                try {
                    System.out.print("Digite a quantidade de produtos de informática que deseja comprar: ");
                    quantidadeProdutos = scanner.nextInt();
                    scanner.nextLine(); 
                    quantidadeValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Quantidade inválida! Digite um número inteiro.");
                    scanner.nextLine(); 
                }
            }

            Pedido novoPedido = new Pedido(nomeCliente);
            for (int i = 1; i <= quantidadeProdutos; i++) {
                System.out.println("Produto " + i + ":");
                System.out.print("Nome: ");
                String nomeProduto = scanner.nextLine();
                int quantidadeProduto = 0;
                boolean quantidadeProdutoValida = false;
                while (!quantidadeProdutoValida) {
                    try {
                        System.out.print("Quantidade: ");
                        quantidadeProduto = scanner.nextInt();
                        scanner.nextLine(); 
                        quantidadeProdutoValida = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Quantidade inválida! Digite um número inteiro.");
                        scanner.nextLine(); 
                    }
                }
                double precoProduto = 0.0;
                while (true) {
                    try {
                        System.out.print("Preço unitário: R$ ");
                        precoProduto = scanner.nextDouble();
                        scanner.nextLine(); 
                        break;
                    } catch (InputMismatchException e) {
                        System.out.println("Preço inválido! Digite um número decimal.");
                        scanner.nextLine(); 
                    }
                }

                Produto produto = new Produto(nomeProduto, quantidadeProduto, precoProduto);
                novoPedido.adicionarProduto(produto);
            }

            listaPedidos.add(novoPedido);

            System.out.print("Deseja cadastrar um novo pedido? (s/n) ");
            String resposta = scanner.nextLine();
            continuarCadastro = resposta.equalsIgnoreCase("s");
        }

        try {
            FileWriter arquivoPedidos = new FileWriter("pedidos.txt");
            PrintWriter gravadorPedidos = new PrintWriter(arquivoPedidos);

            for (Pedido pedido : listaPedidos) {
                gravadorPedidos.println(pedido.getNomeCliente());
                for (Produto produto : pedido.getListaProdutos()) {
                    gravadorPedidos.printf("%s,%d,%.2f%n", produto.getNome(), produto.getQuantidade(),
                            produto.getPrecoUnitario());
                }
                gravadorPedidos.println(); 
            }

            gravadorPedidos.close();
            arquivoPedidos.close();

            System.out.println("Pedidos cadastrados com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo de pedidos.");
            e.printStackTrace();
        }

        
        ArrayList<String> listaNomesClientes = new ArrayList<String>();
        ArrayList<Double> listaValoresTotais = new ArrayList<Double>();

        for (Pedido pedido : listaPedidos) {
            String nomeCliente = pedido.getNomeCliente();
            if (listaNomesClientes.contains(nomeCliente)) {
                int index = listaNomesClientes.indexOf(nomeCliente);
                double valorAtual = listaValoresTotais.get(index);
                double novoValor = valorAtual + pedido.calcularValorTotal();
                listaValoresTotais.set(index, novoValor);
            } else {
                listaNomesClientes.add(nomeCliente);
                listaValoresTotais.add(pedido.calcularValorTotal());
            }
        }

        
        try {
            FileWriter arquivoTotalPedidos = new FileWriter("total_pedidos.txt");
            PrintWriter gravadorTotalPedidos = new PrintWriter(arquivoTotalPedidos);

            for (int i = 0; i < listaNomesClientes.size(); i++) {
                String nomeCliente = listaNomesClientes.get(i);
                double valorTotal = listaValoresTotais.get(i);
                gravadorTotalPedidos.printf("%s - R$ %.2f%n", nomeCliente, valorTotal);
            }

            gravadorTotalPedidos.close();
            arquivoTotalPedidos.close();

            System.out.println("Arquivo com total de pedidos gerado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo com total de pedidos.");
            e.printStackTrace();
        }
    }
}

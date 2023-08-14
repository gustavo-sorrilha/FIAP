package model;

import java.util.ArrayList;

public class Pedido {
    private String nomeCliente;
    private ArrayList<Produto> listaProdutos;

    public Pedido(String nomeCliente) {
        this.nomeCliente = nomeCliente;
        this.listaProdutos = new ArrayList<Produto>();
    }

    public void adicionarProduto(Produto produto) {
        listaProdutos.add(produto);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public ArrayList<Produto> getListaProdutos() {
        return listaProdutos;
    }

    public double calcularValorTotal() {
        double valorTotal = 0.0;
        for (Produto produto : listaProdutos) {
            valorTotal += produto.getQuantidade() * produto.getPrecoUnitario();
        }
        return valorTotal;
    }

	
	
}


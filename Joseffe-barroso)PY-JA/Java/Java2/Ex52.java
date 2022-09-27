package p_o_o;

import java.util.Scanner;

public class Ex52 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	    Produto[] listaproduto = new Produto[10];
	    
	  
		
		System.out.println("..::Cadastro de Produtos::..");
		
		for(int i=0; i<=1; i++) {
			Produto p = new Produto();
			
			System.out.print("Digite o ID: ");
			p.id = ler.nextInt();
			
			System.out.print("Digite o descrição: ");
			p.descrição = ler.next();
			
			System.out.print("Digite a valor: ");
			p.valor = ler.nextDouble();
			
			System.out.print("Digite o quantidade: ");
			p.quantidade = ler.nextDouble();
			
			listaproduto[i] = p;
		}
		
		for(int i=0; i<=1; i++) {
			if(listaproduto[i].valor <= 100) {
				System.out.print("ID: " + listaproduto[i].id);
				System.out.print("Descrição: " + listaproduto[i].descrição);
				System.out.print("Valor: " + listaproduto[i].valor);
				System.out.print("Quantidade: " + listaproduto[i].quantidade);
				
			}
				
		}

	}

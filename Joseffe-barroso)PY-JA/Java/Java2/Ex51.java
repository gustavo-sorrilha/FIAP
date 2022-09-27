package p_o_o;

import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	    Cliente[] listacliente = new Cliente[5];
		
		System.out.println("..::Cadastro de Clientes::..");
		
		for(int i=0; i<=1; i++) {
			Cliente c = new Cliente();
			
			System.out.print("Digite o ID: ");
			c.id = ler.nextInt();
			
			System.out.print("Digite o Nome: ");
			c.nome = ler.next();
			
			System.out.print("Digite a Idade: ");
			c.idade = ler.nextInt();
			
			System.out.print("Digite o email: ");
			c.email = ler.next();
			
			listacliente[i] = c;
		}
		
		for(int i=0; i<=1; i++) {
			if(listacliente[i].idade >= 18) {
				System.out.print("ID: " + listacliente[i].id);
				System.out.print("Nome: " + listacliente[i].nome);
				System.out.print("Idade: " + listacliente[i].idade);
				System.out.print("ID: " + listacliente[i].email);
				
			}
				
		}

	}

}

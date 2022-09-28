package p_o_o;

import java.util.Scanner;

public class Ex53 {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
		    Aluno[] listaaluno = new Aluno[5];
			
			System.out.println("..::Cadastro de Alunos::..");
			
			for(int i=0; i<=1; i++) {
				Aluno a = new Aluno();
				
				System.out.print("Digite o RA: ");
				a.ra = ler.next();
				
				System.out.print("Digite o Nome: ");
				a.nome = ler.next();
				
				System.out.print("Digite as Materias: ");
				a.materias = ler.next(6);
				
				System.out.print("Digite o periodo (Manhã/Noite): ");
				a.periodo = ler.next();
				
				listaaluno[i] = a;
			}
			
			for(int i=0; i<=1; i++) {
				if(listaaluno[i].periodo == "Noite") {
					System.out.print("RA: " + listaaluno[i].ra);
					System.out.print("Nome: " + listaaluno[i].nome);
					System.out.print("Materias: " + listaaluno[i].materias);
					System.out.print("Periodo: " + listaaluno[i].periodo);
					
				}
					
			}

		}

	}

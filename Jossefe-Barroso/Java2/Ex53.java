package Java2;

import java.util.Scanner;

public class Ex53 {

		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
		    Aluno[] listaaluno = new Aluno[5];
			
			System.out.println("..::Cadastro de Alunos::..");
			
			for(int i=0; i<=4; i++) {
				Aluno a = new Aluno();
				
				System.out.print("Digite o RA: ");
				a.ra = ler.next();
				
				System.out.print("Digite o Nome: ");
				a.nome = ler.next();
				
				System.out.print("Digite o periodo (Manhã/Noite): ");
				a.periodo = ler.next();
				
				String[] mat = new String[6];
				System.out.print("Digite as suas materias/disciplinas: ");
				for(int j=0; j<=5;j++) {
					System.out.print("Digite a sigla da disciplina: ");
					mat[j] = ler.next();
				}
				
				a.materias = mat;
				
				listaaluno[i] = a;
			}
			
			for(int i=0; i<=4; i++) {
				if(listaaluno[i].periodo.equals("Noite")) {
					System.out.print("RA: " + listaaluno[i].ra);
					System.out.print("Nome: " + listaaluno[i].nome);
					System.out.print("Periodo: " + listaaluno[i].periodo);
					System.out.print("Materias: ");
					for(int j=0; j<=4; j++)
					System.out.print(listaaluno[i].materias[j]);
							
					
				}
					
			}

		}

	}

package Aula;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
	       Double p1,p2,t;
	       
	       System.out.printf("Digite a nota prova 1:   ");
			p1 = ler.nextDouble();
			System.out.printf("Digite a nota prova 1:  ");
			p2 = ler.nextDouble();
			
       t = (p1 + 2 * p2)/3;
    		   
       if (t < 5)
    		System.out.printf("Reprovado!");
	} else {
		    System.out.printf("Aprovado!");
		}

	}

}

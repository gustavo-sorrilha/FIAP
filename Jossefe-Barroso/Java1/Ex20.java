package Aula;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Double p1,p2;
		
		System.out.printf("Digite a nota prova 1:   ");
		p1 = ler.nextDouble();
		
		p2 = (3 * 5 - p1 )/2;
		
		System.out.printf("A nota necessária para ser aprovado é: %f ", p2);

	}

}

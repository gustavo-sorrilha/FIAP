package Aula;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Double a,b,c,SmCatetos;
		
		System.out.printf("Digite a altura: ");
		a = ler.nextDouble();
		System.out.printf("Digite o cateto: ");
		b = ler.nextDouble();
		System.out.printf("Digite o cateto: ");
		c = ler.nextDouble();
		
		SmCatetos = (c * c) + (b * b);
		
		if ((a * a == SmCatetos)) {
			System.out.printf("É um triângulo retângulo");
		}	
		else {
			System.out.printf("Não é um triângulo retângulo");
		}

	}

}

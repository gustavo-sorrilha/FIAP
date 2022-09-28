package JavaWhile;

import java.util.Scanner;

public class Ex49w {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int x, y, soma;
		
		System.out.println("Digite o início do intervalo: ");
		x = ler.nextInt();
		
		System.out.println("Digite o final do intervalo: ");
		y = ler.nextInt();
		
		while (y <= x) {
			System.out.println("O valor final deve ser maior do que o valor inicial.");
			System.out.println("Digite o final do intervalo: ");
			y = ler.nextInt();
		}
		
		soma = 0;
		
		while (x <= y) {
			soma = soma + x;
			x++;
		}
		
		System.out.println("A soma dos valores do intervalo é: " + soma);
		
		scanner.close();
	}
}
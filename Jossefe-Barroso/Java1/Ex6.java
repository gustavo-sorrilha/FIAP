package Aula;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double c, dolar, result;

		System.out.println("Qual a cotação atual?");
		c = scanner.nextDouble();

		System.out.println("Qual a quantidade em Dolar (US$)?");
		dolar = scanner.nextDouble();

		result = c * dolar;

		System.out.printf("A quantidade final é: %f", result);

		scanner.close();
	}

}
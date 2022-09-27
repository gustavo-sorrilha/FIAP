package Aula;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double h, Base, totalArea;

		System.out.print("Digite a altura do retângulo:");
		h = scanner.nextDouble();

		System.out.print("Digite a base do retângulo:");
		Base = scanner.nextDouble();

		totalArea = Base * h;

		System.out.printf("A área do retângulo é: %f", totalArea);

		scanner.close();
	}

}
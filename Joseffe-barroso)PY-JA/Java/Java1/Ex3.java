package Aula;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double l, Base, totalArea;

		System.out.print("Digite a altura do triângulo:");
		l = scanner.nextDouble();

		System.out.print("Digite a base do triângulo: ");
		Base = scanner.nextDouble();

		totalArea = (Base * l) / 2;

		System.out.printf("A área do triângulo é: %f", totalArea);

		scanner.close();
	}

}
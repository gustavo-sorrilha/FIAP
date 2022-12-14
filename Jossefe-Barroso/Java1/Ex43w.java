package JavaWhile;

import java.util.Scanner;

public class Ex43w {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double n, i, soma, dividendo, divisor, divisao;

		System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 50): ");
		n = scanner.nextInt();

		while ((n <= 0) || (n > 50)) {
			System.out.println("O valor de N deve ser positivo e menor que 50.");
			System.out.println("Digite o termo que quer encontrar (valor deve ser positivo e menor que 50): ");
			n = scanner.nextInt();
		}

		i = 1;
		soma = 0;

		while (i <= n) {
			dividendo = (Math.pow(i, 2)) + 1;
			divisor = (Math.pow(i, 3));
			divisao = dividendo / divisor;
			System.out.println(i + ". " + (int) dividendo + "/" + (int) divisor);
			i++;
			soma = soma + divisao;
		}
		System.out.printf("A soma é: %.2f", soma);

		scanner.close();
	}

}
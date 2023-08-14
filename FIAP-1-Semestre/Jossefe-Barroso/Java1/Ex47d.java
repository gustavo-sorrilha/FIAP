package Java;

import java.util.Scanner;

public class Ex47d {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String novocalculo;
		int fatorial, x, x1;

		novocalculo = "S";

		while (novocalculo.toUpperCase().equals("S")) {
			fatorial = 1;

			System.out.println("Digite um número (positivo) : ");
			x = scanner.nextInt();
			x1 = x;

			while (x < 0) {
				System.out.println("O valor deve ser positivo.");
				System.out.println("Digite um número (positivo) : ");
				x = scanner.nextInt();
				x1 = x;
			}
			if (x == 0) {
				System.out.println("0! = 1");
				System.out.println("Deseja calcular novamente? (S ou N)");
				novocalculo = scanner.next();

				while ((!novocalculo.toUpperCase().equals("S")) && (!novocalculo.toUpperCase().equals("N"))) {
					System.out.println("Responder com S para SIM ou N para NÃO");
					System.out.println("Deseja calcular novamente? (S ou N)");
					novocalculo = scanner.next();
				}
			} else {
				do {
					fatorial = fatorial * x;
					x = x - 1;
				} while (x > 0);
				System.out.println(x1 + "! = " + fatorial);

				System.out.println("Deseja calcular novamente? (S ou N)");
				novocalculo = scanner.next();

				while ((!novocalculo.toUpperCase().equals("S")) && (!novocalculo.toUpperCase().equals("N"))) {
					System.out.println("Responder com S para SIM ou N para NÃO");
					System.out.println("Deseja calcular novamente? (S ou N)");
					novocalculo = scanner.next();
				}
			}
		}
		System.out.println("Programa Encerrado.");

		scanner.close();
	}

}
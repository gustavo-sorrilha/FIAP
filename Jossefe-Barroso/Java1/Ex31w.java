package JavaWhile;

import java.util.Scanner;

public class Ex31w {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int value;
		
		System.out.print("Informe um valor: ");
		value = scanner.nextInt();
		
		while(value <= 0) {
			System.out.print("Informe somente valores positivos: ");
			value = scanner.nextInt();
		}
		
		System.out.print("Thank you");
		
		scanner.close();
	}


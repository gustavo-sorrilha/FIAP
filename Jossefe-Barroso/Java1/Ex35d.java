package Java;

import java.util.Scanner;

public class Ex35d {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int value;
		
		System.out.print("Informe um valor qualquer: ");
		value = scanner.nextInt();
		
		while (value <= 0) {
			System.out.print("Informe um valor positivo: ");
			value = scanner.nextInt();
		}
		
		int index, result;
		index = 1;
		
		do {
			result = value * index;
			System.out.printf("\n%d X %d = %d", value, index, result);
			index = index + 1;
		} while (index < 11);
		
		scanner.close();
	}

}
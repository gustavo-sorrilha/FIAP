package Java;

public class Ex38d {

	public static void main(String[] args) {
		int index = 1, finalValue = 0, currentValue;

		do {
			currentValue = index;
			finalValue = finalValue + currentValue;
			index = index + 1;
		} while (index < 101);

		System.out.printf("O resultado da soma no intervalo de um a cem deu: %d", finalValue);
	}

}
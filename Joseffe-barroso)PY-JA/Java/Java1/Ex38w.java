package JavaWhile;

public class Ex38w {

	public static void main(String[] args) {
		int index = 1, finalValue = 0, currentValue;

		while (index < 101) {
			currentValue = index;
			finalValue = finalValue + currentValue;
			index = index + 1;
		}

		System.out.printf("O resultado da soma no intervalo de um a cem deu: %d", finalValue);
	}

}
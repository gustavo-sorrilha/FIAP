package JavaWhile;

public class Ex39w {

	public static void main(String[] args) {
		int index = 1, p = 0, n = 1, s = 0;

		while (index < 31) {
			System.out.printf("\n%d", n);
			s = n + p;
			p = n;
			n = s;
			index = index + 1;
		}
	}
}
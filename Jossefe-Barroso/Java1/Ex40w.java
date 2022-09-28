package JavaWhile;

public class Ex40w {

	public static void main(String[] args) {
		int index = 1, f = -1, s = 1, t = 1, so = 0;

		while (index < 31) {
			System.out.printf("\n%d", s);
			s = s + f + t;
			f = s;
			s = t;
			t = so;
			index = index + 1;
		}
	}

}
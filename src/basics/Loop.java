package basics;

public class Loop {
	public static void main(String... args) {
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println(i);

		}
		int i = 0;
		while (i < 10) {
			if (i == 5) {
				break;

			}
			System.out.println(i++);
		}
		i = 0;
		do {
			System.out.println(i++);
		} while (i < 4);
	}
}

package basics;

public class Condition {
	public static void main(String... args) {
		if (true) {
			System.out.println("hello");
		}
		int number = 20;

		switch (number) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		default:
			System.out.println("sorry not found");
		}
	}
}
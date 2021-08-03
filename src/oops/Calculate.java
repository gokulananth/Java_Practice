package oops;

import java.util.Scanner;

class Calculator {
	void add(int a, int b) {
		System.out.println(a + b);
	}

	void mult(int a, int b) {
		System.out.println(a * b);
	}

	void sub(int a, int b) {
		System.out.println(a - b);
	}
}

public class Calculate {
	public static void main(String... args) {
		Calculator o1 = new Calculator();
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(), b = scan.nextInt();
		System.out.println("1.Add\n2.multiply\n3.subtract");
		int opt = scan.nextInt();
		if (opt == 1) {
			o1.add(a, b);
		} else if (opt == 2) {
			o1.mult(a, b);
		} else {
			o1.sub(a, b);
		}
		scan.close();
	}
}

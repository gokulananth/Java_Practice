package exception;

class Custom extends Exception {
	Custom(String s) {
		super(s);
	}
}

public class CustomException {
	public static void main(String[] args) {
		try {
			throw new Custom("Just an exception");
		} catch (Custom e) {
			System.out.println(e);
		}
		System.out.println("hi");
	}
}

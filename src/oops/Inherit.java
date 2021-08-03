package oops;

class simple {
	void paint() {
		System.out.println("Hi");
	}
}

public class Inherit extends simple {
	public static void main(String... args) {

		Inherit obj = new Inherit();
		obj.paint();
	}

}

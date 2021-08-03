package varargs;

public class Varargs {
	
	static void add(int ...value ) {
		int sum=0;
		for(int i:value) {
			sum+=i;
		}
		System.out.println(sum);
	}
	
	public static void main(String... args) {
		add(1,2,3,4,5,6);
		add(9,8);
		add(5,7,8);
		add(1);
	}
}

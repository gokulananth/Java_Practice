package collection;

import java.util.*;

public class ArrrayLists {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add("hi");
		arr.add(1);
		arr.add(1.1);
		arr.add('a');
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(2);
		a.add(1);
		a.add(4);

		a.add(3);

		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
	}
}

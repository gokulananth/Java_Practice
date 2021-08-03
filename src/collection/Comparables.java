package collection;

import java.util.*;

import collection.Car;

public class Comparables {
	public static void main(String... args) {
		ArrayList<Car> obj = new ArrayList<Car>();
		obj.add(new car("audi", "q8", "sedan", 101));
		obj.add(new car("Maruthi suzuki", "swift", "sedan", 100));
		obj.add(new car("Volswogan", "polo", "hatchback", 103));
		obj.add(new car("Hundai", "i20", "Hatchback", 105));
		Collections.sort(obj);
		for (Car i : obj) {
			System.out.println(i.id);
		}
	}
}

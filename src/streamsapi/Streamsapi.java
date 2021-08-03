package streamsapi;

import java.util.*;
import java.util.stream.Stream;

public class Streamsapi {

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

		System.out.println(li.parallelStream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
		System.out.println(li.stream().map(i -> i * 2).reduce(0, (c, e) -> c + e));
		System.out.println(li.stream().filter(i -> i % 2 == 0).reduce(0, Integer::sum));
		System.out.println(li.stream()
				.filter(Streamsapi::div)
				.map(Streamsapi::mapping)
				.findFirst().orElse(0));
		Stream<List<String>> namesOriginalList = Stream.of(
				Arrays.asList("Pankaj"), 
				Arrays.asList("David", "Lisa"),
				Arrays.asList("Amit"));
			//flat the stream from List<String> to String stream
			Stream<Object> flatStream = namesOriginalList
				.map(i->i);
			System.out.println("----");
			flatStream.forEach((i)->System.out.println(i.getClass().getName()));
			Stream<List<String>> namesOriginalList1 = Stream.of(
					Arrays.asList("Pankaj"), 
					Arrays.asList("David", "Lisa"),
					Arrays.asList("Amit"));
				//flat the stream from List<String> to String stream
				Stream<String> flatStream1 = namesOriginalList1
					.flatMap(strList -> strList.stream());

				flatStream1.forEach(System.out::println);
	}

	static boolean div(Integer i) {
		System.out.println("in div " + i);
		return i % 2 == 0;

	}

	static int mapping(Integer i) {
		System.out.println("in mapping " + i);
		return i * 2;
	}
}

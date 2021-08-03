package completableFeature;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExceptionCases {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		int age = 25;

		CompletableFuture<String> vote0 = CompletableFuture.supplyAsync(() -> {
			if (age < 18) {
				throw new IllegalArgumentException("Cant Vote");
			} else {
				return "Can Vote";
			}
		}).exceptionally(ex -> {

			System.out.println("exception here " + ex.getMessage());

			return "Unknown";
		}).thenApply((value) -> value);

		System.out.println("You : " + vote0.get());

		CompletableFuture<String> vote1 = CompletableFuture.supplyAsync(() -> {
			if (age < 18) {
				throw new IllegalArgumentException("Cant Vote");
			} else {
				return "Can Vote";
			}
		}).handle((res, ex) -> {

			if (ex != null) {

				System.out.println("exception here  " + ex.getMessage());
				return "Unknown";

			}
			return res;
		});

		System.out.println("You : " + vote1.get());

	}
}

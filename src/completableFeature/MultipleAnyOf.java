package completableFeature;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class MultipleAnyOf {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
			return "Result of Future 1";
		});

		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
			return "Result of Future 2";
		});

		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(3);
			} catch (Exception e) {
				throw new IllegalStateException(e);
			}
			return "Result of Future 3";
		});

		CompletableFuture<Object> anyOfFuture = CompletableFuture.anyOf(future1, future2, future3);

		System.out.println(anyOfFuture.get()); // Result of Future 2

	}

}

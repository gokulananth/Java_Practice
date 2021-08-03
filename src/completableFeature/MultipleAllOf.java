package completableFeature;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.*;

public class MultipleAllOf {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

		CompletableFuture<String> future1 =  CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return "future1 completed\n";
		});

		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return "future2 completed\n";
		});

		CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return "future3 completed\n";
		});

		
		CompletableFuture<Void> combinedFuture = CompletableFuture.allOf(future1, future2, future3);
		System.out.println(combinedFuture);

		combinedFuture.get();
		
		System.out.println(combinedFuture);

		combinedFuture.thenApply(
				v -> Stream.of(future1, future2, future3).map(CompletableFuture::join).collect(Collectors.toList()));

		System.out.println(combinedFuture);

		String combined = Stream.of(future1, future2, future3).map(CompletableFuture::join)
				.collect(Collectors.joining(""));

		System.out.println(combinedFuture);

		System.out.println(combined);

	}

}

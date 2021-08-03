package completableFeature;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class Methods {
	public static void main(String... args) throws InterruptedException, ExecutionException {
		CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Running asynchronous task in parallel");
				
			} catch (InterruptedException ex) {
				throw new IllegalStateException(ex);
			}
		});
		System.out.println("Hello");
		CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return "This is the result of the asynchronous computation";
		});

		future2.complete("Result");

		System.out.println(future2.get());
		
		System.out.println("Hello");
		

	}
}

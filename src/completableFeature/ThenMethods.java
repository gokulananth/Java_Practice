package completableFeature;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class ThenMethods {
	public static void main(String... args) throws InterruptedException, ExecutionException {

		//thenApply methods
		
		CompletableFuture<String> welcomeText = CompletableFuture.supplyAsync(() -> {
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				throw new IllegalStateException(e);
			}
			return "Gokul ";
		}).thenApply(name -> {
			return "Hello " + name;
		}).thenApply(greeting -> {
			return greeting + "Welcome here";
		});
		System.out.println(welcomeText.get());
		
		//thenAccept method
		
		CompletableFuture.supplyAsync(() -> {
			return "Thats correct";
		}).thenAccept(product -> {
			System.out.println("Accept can access this result " + product);
		});
		
		
		
		//thenRun method
		
		CompletableFuture.runAsync(() -> {
			System.out.print("Can't Return ");
		}).thenRun(() -> {
			System.out.println("Just invoke the method");
		});
		
		
		CompletableFuture.supplyAsync(() -> {
		    return "Some Result";
		}).thenApplyAsync(result -> {
		    
		    return "Processed Result";
		});
		
	}
	
	
}

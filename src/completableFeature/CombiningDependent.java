package completableFeature;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.*;

public class CombiningDependent {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		CompletableFuture<String> completableFuture =
		           CompletableFuture.supplyAsync(() –> "Hello")
		                   .thenCompose(value –>
		                           CompletableFuture.supplyAsync(
		                                   () –> value ));
		   completableFuture.thenAccept(System.out::println); 
		   
		   CompletableFuture<CompletableFuture<String>> completableFuture =
		           CompletableFuture.supplyAsync(() –> "Hello")
		                   .thenApply(value –> CompletableFuture.supplyAsync(
		                           () –> value));
		   //Perform operation
		
		
	}

}

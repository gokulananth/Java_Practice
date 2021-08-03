package completableFeature;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CombineIndependent {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		CompletableFuture<Double> weight = CompletableFuture.supplyAsync(() -> {

			return 65.0;
		});

		CompletableFuture<Double> height = CompletableFuture.supplyAsync(() -> {

			return 177.8;
		});

		System.out.println("Calculating BMI.");

		CompletableFuture<Double> combinedFuture = weight.thenCombine(height, (weightInKg, heightInCm) -> {
			Double heightInMeter = heightInCm / 100;
			return weightInKg / (heightInMeter * heightInMeter);
		});

		System.out.println("Your BMI is - " + combinedFuture.get());
	}
}

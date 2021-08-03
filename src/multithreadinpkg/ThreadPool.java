package multithreadinpkg;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class ThreadPool {
	public static void main(String[] args) {
        System.out.println("current thread : " + Thread.currentThread().getName());

        System.out.println("start service...");
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Runnable runnable = () -> {
            System.out.println("inside runnable: " + Thread.currentThread().getName());
        };

        System.out.println("submit the task to the executor service...");
        executorService.submit(runnable);
        
        System.out.println("Shutting down executor...");
        executorService.shutdown();
    }
}
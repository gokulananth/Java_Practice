package multithreadinpkg;

public class ReentrantLock {
	public static void main(String[] args) throws InterruptedException {
		ReentrantLockCounter obj = new ReentrantLockCounter();
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 1000; i++)
					obj.increment();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 1; i <= 1000; i++)
					obj.increment();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(obj.count);

	}
}
/*
 * The tryLock() method tries to acquire the lock without pausing the thread.
 * That is, If the thread couldn’t acquire the lock because it was held by some
 * other thread, then It returns immediately instead of waiting for the lock to
 * be released.
 */
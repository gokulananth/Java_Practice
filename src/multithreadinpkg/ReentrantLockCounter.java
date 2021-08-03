package multithreadinpkg;
import java.util.concurrent.locks.ReentrantLock;


public class ReentrantLockCounter {
	 final ReentrantLock lock = new ReentrantLock();

     int count = 0;

    public void  increment() {
        lock.lock();
        try {
            count = count + 1;
        } finally {
        lock.unlock();
        }
    }
}



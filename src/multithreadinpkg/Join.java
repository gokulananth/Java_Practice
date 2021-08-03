package multithreadinpkg;

public class Join extends Thread  {

	public static void main(String[] args) throws InterruptedException {

			Thread t1= new Thread(()->{
				for(int i=0;i<10;i++) {
					System.out.println("Hello");
				}
			});
			Thread t2= new Thread(()->{
				for(int i=0;i<10;i++) {
					System.out.println("Program");
				}
			});
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			System.out.println("Terminated");
	}

}

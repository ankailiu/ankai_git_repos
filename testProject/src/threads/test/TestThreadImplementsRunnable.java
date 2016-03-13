package threads.test;

public class TestThreadImplementsRunnable implements Runnable{

	public static void main(String[] args) {
		TestThreadImplementsRunnable ttir = new TestThreadImplementsRunnable();
		new Thread(ttir).start();
	}

	@Override
	public void run() {
		System.out.println("Enter the run.");
		
	}

}

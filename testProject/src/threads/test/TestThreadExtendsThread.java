package threads.test;

public class TestThreadExtendsThread extends Thread{
	
	
	public void run(){
		System.out.println("Enter the thread......");
	}

	public static void main(String[] args) {
		TestThreadExtendsThread ttet = new TestThreadExtendsThread();
		ttet.start();
	}

}

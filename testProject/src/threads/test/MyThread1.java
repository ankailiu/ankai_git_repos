package threads.test;

public class MyThread1 implements Runnable {
	
	Object object = new Object();
	int count = 0;

	@Override
    public void run() {
		String name = Thread.currentThread().getName();
//		String inf=Thread.currentThread().toString();
		long idnum = Thread.currentThread().getId();
		synchronized (object) {
			count++;
			System.out.println("Thread Name:"+name +" Thread Id:"+idnum +" count:"+count);
		}
		
	}

}

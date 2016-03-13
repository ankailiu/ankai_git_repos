package threads.test;


public class SimpleThreadTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread threads[] = new Thread[100];
		MyRunnableThread target = new MyRunnableThread();
        for(int i = 0 ;i< threads.length;i++){
        	threads[i] = new Thread(target, "th******"+i);
        }
        for(int i = 0 ;i< threads.length;i++){
        	threads[i].start();
        }
        
        try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Total:" + target.count);

	}

}

package threads.test;

/**
 * 当Thread-0进入睡眠状态之后，Thread-1并没有去执行具体的任务。只有当Thread-0执行完之后，此时Thread-0释放了对象锁，Thread-1才开始执行。
　　注意，如果调用了sleep方法，必须捕获InterruptedException异常或者将该异常向上层抛出。当线程睡眠时间满后，不一定会立即得到执行，因为此时可能CPU正在执行其他的任务。所以说调用sleep方法相当于让线程进入阻塞状态
 * @author lenovo
 *
 */
public class ThreadSleepTest {
	
	private int i = 10;
    private Object object = new Object();

	public static void main(String[] args) {
		
		ThreadSleepTest test = new ThreadSleepTest();
        MyThread thread1 = test.new MyThread();
        MyThread thread2 = test.new MyThread();
        MyThread thread3 = test.new MyThread();
        thread1.start();
        thread2.start();
        thread3.start();
	}
	
	class MyThread extends Thread{
        @Override
        public void run() {
            synchronized (object) {
                i++;
                System.out.println("entry synchronized i:"+i);
//                try {
                    System.out.println("线程"+Thread.currentThread().getName()+"进入睡眠状态");
//                    Thread.currentThread().sleep(1000);
//                } catch (InterruptedException e) {
                    // TODO: handle exception
//                }
                System.out.println("线程"+Thread.currentThread().getName()+"睡眠结束");
                i++;
                System.out.println("out synchronized i:"+i);
            }
        }
    }

}

package threads.test;

/**
 * ��Thread-0����˯��״̬֮��Thread-1��û��ȥִ�о��������ֻ�е�Thread-0ִ����֮�󣬴�ʱThread-0�ͷ��˶�������Thread-1�ſ�ʼִ�С�
����ע�⣬���������sleep���������벶��InterruptedException�쳣���߽����쳣���ϲ��׳������߳�˯��ʱ�����󣬲�һ���������õ�ִ�У���Ϊ��ʱ����CPU����ִ����������������˵����sleep�����൱�����߳̽�������״̬
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
                    System.out.println("�߳�"+Thread.currentThread().getName()+"����˯��״̬");
//                    Thread.currentThread().sleep(1000);
//                } catch (InterruptedException e) {
                    // TODO: handle exception
//                }
                System.out.println("�߳�"+Thread.currentThread().getName()+"˯�߽���");
                i++;
                System.out.println("out synchronized i:"+i);
            }
        }
    }

}

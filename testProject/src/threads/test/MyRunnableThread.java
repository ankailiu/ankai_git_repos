package threads.test;

public class MyRunnableThread implements Runnable {
	
	public static   int count = 0;
	

	@Override
    public  void run() {
		System.out.println("��ʼ���߳�����**********:"+Thread.currentThread().getName());
		for(int i = 0;i<10;i++){
//			synchronized(this){
				
				count++;
				
//			}
		}
		System.out.println("�������߳�����%%%%%%%%%:"+Thread.currentThread().getName());
	}
	
	private void inc(){
		count ++;
	}

}

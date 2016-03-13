package threads.test;

/*
 * 
 * 
 * 死锁产生的四个必要条件。
 * 
 *1>互斥使用，即当资源被一个线程使用(占有)时，别的线程不能使用
 *
 *2>不可抢占，资源请求者不能强制从资源占有者手中夺取资源，资源只能由资源占有者主动释放。
 *
 *3>请求和保持，即当资源请求者在请求其他的资源的同时保持对原有资源的战友。
 *
 *4>循环等待，即存在一个等待队列：P1占有P2的资源，P2占有P3的资源，P3占有P1的资源。这样就形成了一个等待环路。  
 *
 *
 *
 * 
 * *********************************************
* 一个简单的死锁类
* 当类的对象flag=1时（T1），先锁定O1,睡眠500毫秒，然后锁定O2；
* 而T1在睡眠的时候另一个flag=0的对象（T2）线程启动，先锁定O2,睡眠500毫秒，等待T1释放O1；
* T1睡眠结束后需要锁定O2才能继续执行，而此时O2已被T2锁定；
* T2睡眠结束后需要锁定O1才能继续执行，而此时O1已被T1锁定；
* T1、T2相互等待，都需要对方锁定的资源才能继续执行，从而死锁。
*/
public class DeadLockDemo implements Runnable {
	
	public int flag = 1;
	static Object o1 = new Object(), o2 = new Object();

	@Override
	public void run() {
		System.out.println("flag=" + flag);
		if(flag == 1) {
			synchronized(o1) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized(o2) {
					System.out.println("1");
				}
			}
		}
		if(flag == 0) {
			synchronized(o2) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				synchronized(o1) {
					System.out.println("0");
				}
			}
		}
	}

	public static void main(String[] args) {
		DeadLockDemo td1 = new DeadLockDemo();
		DeadLockDemo td2 = new DeadLockDemo();
		td1.flag = 1;
		td2.flag = 0;
		new Thread(td1).start();
		new Thread(td2).start();

	}

}

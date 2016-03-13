package designpatterns.singleton;

public class SingletonClient {
	
	private static final int THREAD_COUNT = 2000;
	
	public static void main(String [] args){
//		TestSingletonMain testSingleton = new TestSingletonMain();
//		testSingleton.testEagerInitalizeSingleton();
//		testSingleton.testLazyInitalizeSingleton();
//		testSingleton.testDoubleCheckSingleton();
//		testSingleton.testLazyInitalizeSingletonInnerClass();
//		testSingleton.testEnumSingleton();
		
		NonSingleton nst1 = new NonSingleton();
		NonSingleton nst2 = new NonSingleton();
		
		if(nst1.equals(nst2) ){
			System.out.println("NonSingleton implementation is singleton");
		}
		
		EagerSingleton es1 = EagerSingleton.getSingleton();
		EagerSingleton es2 = EagerSingleton.getSingleton();
		if(es1 == es2){
			System.out.println("EagerSingleton implementation is singleton");
		}
		
		LazySingleton ls1 = LazySingleton.getSingleton();
		LazySingleton ls2 = LazySingleton.getSingleton();
		if(ls1 == ls2){
			System.out.println("LazySingleton implementation is singleton");
		}
		
		DoubleCheckSingleton dcs1 = DoubleCheckSingleton.getSingleton();
		DoubleCheckSingleton dcs2 = DoubleCheckSingleton.getSingleton();
		if(dcs1 == dcs2){
			System.out.println("DoubleCheckSingleton implementation is singleton");
		}
		
		StaticInnerClassSingleton sics1 = StaticInnerClassSingleton.getSingleton();
		StaticInnerClassSingleton sics2 = StaticInnerClassSingleton.getSingleton();
		if(sics1 == sics2){
			System.out.println("StaticInnerClassSingleton implementation is singleton");
		}
		
		EnumSingleton ens1 = EnumSingleton.INSTANCE;
		EnumSingleton ens2 = EnumSingleton.INSTANCE;
		if(ens1 == ens2){
			System.out.println("EnumSingleton implementation is singleton");
		}
	}

	private void testEagerInitalizeSingleton() {
		Thread [] threads = new Thread[THREAD_COUNT];
		for(int i= 0;i<threads.length;i++){
			threads[i] = new Thread(new Runnable(){
				@Override
				public void run(){
					EagerSingleton.getSingleton();
				}
			});
			threads[i].start();
		}
	}
	
	private void testLazyInitalizeSingleton() {
		long start = System.currentTimeMillis();
		Thread [] threads = new Thread[THREAD_COUNT];
		for(int i= 0;i<threads.length;i++){
			threads[i] = new Thread(new Runnable(){
				@Override
				public void run(){
					LazySingleton.getSingleton();
				}
			});
			threads[i].setName("Thread: "+i);
			threads[i].start();
		}
		long end = System.currentTimeMillis();
		long total = end - start;
		System.out.println("========="+ total);
	}
	
	private void testDoubleCheckSingleton(){
		long start = System.currentTimeMillis();
		Thread[] threads = new Thread[THREAD_COUNT];
		for(int i = 0;i<threads.length;i++){
			threads[i] = new Thread(new Runnable(){
				@Override
				public void run(){
					DoubleCheckSingleton.getSingleton();
				}
			});
			threads[i].setName("Thread: "+i);
			threads[i].start();
		}
		
		long end = System.currentTimeMillis();
		long total = end - start;
		System.out.println("========="+ total);
	}
	
	private void testLazyInitalizeSingletonInnerClass() {
		long start = System.currentTimeMillis();
		Thread [] threads = new Thread[THREAD_COUNT];
		for(int i= 0;i<threads.length;i++){
			threads[i] = new Thread(new Runnable(){
				@Override
				public void run(){
					StaticInnerClassSingleton.getSingleton();
				}
			});
			threads[i].setName("Thread: "+i);
			threads[i].start();
		}
		long end = System.currentTimeMillis();
		long total = end - start;
		System.out.println("========="+ total);
	}
	
	private void testEnumSingleton(){
		long start = System.currentTimeMillis();
		Thread [] threads = new Thread[THREAD_COUNT];
		for(int i= 0;i<threads.length;i++){
			threads[i] = new Thread(new Runnable(){
				@Override
				public void run(){
					EnumSingleton singleton = EnumSingleton.INSTANCE;
					singleton.work();
				}
			});
			threads[i].setName("Thread: "+i);
			threads[i].start();
		}
		long end = System.currentTimeMillis();
		long total = end - start;
		System.out.println("========="+ total);
	}

}

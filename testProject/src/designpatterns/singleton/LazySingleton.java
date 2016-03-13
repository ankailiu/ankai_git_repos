package designpatterns.singleton;

/*
 * Merit: Lazy initialize
 * synchronized at function level,performance is not high.
 */
public class LazySingleton {
	
	private static LazySingleton singleton = null;
	private LazySingleton(){
	}
	
	
	public static synchronized LazySingleton getSingleton(){
		System.out.println(Thread.currentThread().getName() +" is starting initalising..");
		if(singleton == null){
			singleton = new LazySingleton();
			System.out.println(Thread.currentThread().getName() +" is ending initalising..");
		}
		return singleton;
	}
	

}

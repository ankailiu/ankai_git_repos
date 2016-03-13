package designpatterns.singleton;

/**
 * singleton = new DoubleCheckSingleton();
 * Different JVM has different implementation, the sequence of new DoubleCheckSingleton() and 
 * singleton = object  is unknown.
 * 
 * 1.Same jVM with two different class loader to load can not ensure singleton.
 * 2. EJB scenario can not ensure singleton.
 * @author Ankai Liu
 *
 */
public class DoubleCheckSingleton {
	
	private static volatile DoubleCheckSingleton singleton = null;
	private DoubleCheckSingleton(){
	}
	
	
	public static DoubleCheckSingleton getSingleton(){
		if(singleton == null){
			synchronized(DoubleCheckSingleton.class){
				System.out.println(Thread.currentThread().getName() +" is starting initalising..");
				if(singleton == null){
					singleton = new DoubleCheckSingleton();
					System.out.println(Thread.currentThread().getName() +" is ending initalising..");
				}
			}
		}
		return singleton;
	}
	

}

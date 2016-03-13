package designpatterns.singleton;

/**
 * Merit: Thread safe
 * Demerit :  initializing when JVM loading the class. cannot lazy loading.
 * @author Ankai Liu
 *
 */
public class EagerSingleton {
	
	private static final EagerSingleton singleton = new EagerSingleton();
	private String name = "";
	
	private EagerSingleton(){
	}
	
	public static EagerSingleton getSingleton(){
		return singleton;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

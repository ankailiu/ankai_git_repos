package designpatterns.singleton;

/**
 * A single-element enum type is the best way to implement a singleton.
 * @author Ankai Liu
 *
 */
public enum EnumSingleton {
	INSTANCE;
	
	public void work(){
		System.out.println("This is a singleton method.");
	}
}

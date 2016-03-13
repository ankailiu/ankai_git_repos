package designpatterns.singleton;

/**
 * Merit: Thread safe and lazy loading.
 * Demerit:  Cannot garbaged by GC.
 * @author Ankai Liu
 *
 */
public class StaticInnerClassSingleton {
	
	private static class SingletonHolder{
		private static final StaticInnerClassSingleton SINGLETON_INSTANCE = new StaticInnerClassSingleton();
	}
	
	private StaticInnerClassSingleton(){
	}
	
	
	public static StaticInnerClassSingleton getSingleton(){
		return SingletonHolder.SINGLETON_INSTANCE;
	}

}

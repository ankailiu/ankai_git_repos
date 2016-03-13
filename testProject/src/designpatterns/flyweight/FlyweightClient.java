package designpatterns.flyweight;

/**
 * Flyweight pattern ensure there are no duplicate object in system.
 * @author Ankai Liu
 *
 */
public class FlyweightClient {

	public static void main(String[] args) {
         showFlyweight();
	}
	
	public static void showFlyweight(){
		 FlyweightFactory factory = new FlyweightFactory();
		 Flyweight fly1 = factory.getFlyweight("Google");  
		 Flyweight fly2 = factory.getFlyweight("Baidu");  
		 Flyweight fly3 = factory.getFlyweight("Google");  
		 Flyweight fly4 = factory.getFlyweight("Google");  
		 Flyweight fly5 = factory.getFlyweight("Google");  
		 Flyweight fly6 = factory.getFlyweight("Google");
		 
		 fly1.operation();
		 fly2.operation();
		 fly3.operation();
		 fly4.operation();
		 fly5.operation();
		 fly6.operation();
		 
		 int flyweightSize = factory.getFlyweightSize();
		 System.out.println("Total flyweight size"+flyweightSize);
	}

}

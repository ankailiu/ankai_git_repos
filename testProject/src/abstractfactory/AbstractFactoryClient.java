package abstractfactory;

/**
 * Abstract factory design pattern provides an interface create a series of class which have somewhat relationship
 * this interface won't give a concrete class.
 * @author Ankai Liu
 *
 */
public class AbstractFactoryClient {

	public static void main(String[] args) {
		
		AbstractFactory absFactoryA = new ConcreteFactoryA();
		AbstractFactory absFactoryB = new ConcreteFactoryB();
		absFactoryA.createProductA();
		absFactoryA.createProdcutB();
		absFactoryB.createProductA();
		absFactoryB.createProdcutB();
	}

}

package abstractfactory;


public class ConcreteFactoryB extends AbstractFactory {

	@Override
	AbstractProductA createProductA() {
		return new ConcreteProductA2();
	}

	@Override
	AbstractProductB createProdcutB() {
		return new ConcreteProductB2();
	}


}

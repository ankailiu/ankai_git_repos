package abstractfactory;

public class ConcreteFactoryA extends AbstractFactory {

	@Override
	AbstractProductA createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	AbstractProductB createProdcutB() {
		return new ConcreteProductB1();
	}


}

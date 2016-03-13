package factorymethod;

public class ConcreteFactory extends AbstractFactory {

	@Override
	Product createProduct() {
		
		Product p1 = new ConcreteProduct1();
		return null;
	}

}

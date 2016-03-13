package designpatterns.decorator;

public class DecoratorClient {

	public static void main(String[] args) {
//		IComponent component = new ConcreteComponent();
//		Decorator decorator= new ConcreteDecorator1(new ConcreteDecorator(component));
		
		IComponent decorator= new ConcreteDecorator(new ConcreteComponent());
		decorator.operation();

	}

}

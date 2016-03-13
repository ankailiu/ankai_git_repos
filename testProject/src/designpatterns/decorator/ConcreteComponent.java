package designpatterns.decorator;

public class ConcreteComponent implements IComponent {

	@Override
	public void operation() {
		System.out.println("Operation in the ConcreteComponent!");
	}

}

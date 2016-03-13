package designpatterns.decorator;

public class ConcreteDecorator extends Decorator {

	public ConcreteDecorator(IComponent component) {
		super(component);
	}
	
	
	public void operation(){
		super.operation();
		this.addBehavior();
	}
	
	private void addBehavior(){
		System.out.println("ConcreteDecorator's new heahavior!");
	}

}

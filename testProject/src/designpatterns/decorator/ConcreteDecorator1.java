package designpatterns.decorator;

public class ConcreteDecorator1 extends Decorator {

	public ConcreteDecorator1(IComponent component) {
		super(component);
	}
	
	public void operation(){
		super.operation();
		this.addBehaviorForConcreteDecorator1();
	}
	
	private void addBehaviorForConcreteDecorator1(){
		System.out.println("ConcreteDecorator1's new heahavior addBehaviorForConcreteDecorator1()!");
	}


}

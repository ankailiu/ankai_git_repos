package designpatterns.decorator;

public class Decorator implements IComponent {
	
	IComponent component;
	
	public Decorator(IComponent component){
		this.component = component;
	}

	@Override
	public void operation() {
		component.operation();
	}

}

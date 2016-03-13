package designpatterns.template;

public class TemplateClient {

	public static void main(String[] args) {
		AbstractTemplate template1 = new ConcreteTemplate1();
		template1.topOperation();
		
		AbstractTemplate template2 = new ConcreteTemplate1();
		template2.topOperation();
	}
}

package designpatterns.facade;

public class Facade {
	
	IServiceA serviceA = null;
	IServiceB serviceB = null;
	IServiceC serviceC = null;
	
	public Facade(){
		serviceA = new ServiceAImpl();
		serviceB = new ServiceBImpl();
		serviceC = new ServiceCImpl();
	}
	
	public void methodA(){
		serviceA.methodA();
		serviceB.methodB();
	}
	
	public void methodB(){
		serviceB.methodB();
		serviceC.methodC();
	}
	
	public void methodC(){
		serviceC.methodC();
		serviceA.methodA();
	}

}

package designpatterns.proxy;

public class Proxy implements Subject {
	
	Subject subject = new RealSubject();

	@Override
	public void operation() {
		System.out.println("Before operation");
		subject.operation();
		System.out.println("After operation");
	}

}

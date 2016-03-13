package dynamicproxy;

public class RealSubject implements Subject {

	@Override
	public void doSomething() {
		System.out.println("Real subject dosomething....");
	}

}

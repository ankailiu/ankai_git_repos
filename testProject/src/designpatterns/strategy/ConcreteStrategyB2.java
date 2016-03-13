package designpatterns.strategy;

public class ConcreteStrategyB2 extends AbstractStrategy2 {

	@Override
	public void algoritm(Context2 context) {
		System.out.println("-----------ConcreteStrategyB2 algoritm----------------");
		System.out.println("-----My parameter1:-----"+context.getParameter1());
		System.out.println("-----My parameter2:-----"+context.getParameter2());
	}

}

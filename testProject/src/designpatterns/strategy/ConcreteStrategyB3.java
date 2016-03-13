package designpatterns.strategy;

public class ConcreteStrategyB3 extends AbstractStrategy2 {

	@Override
	public void algoritm(Context2 context) {
		System.out.println("-----------ConcreteStrategyB3 algoritm----------------");
		System.out.println("-----My parameter1:-----"+context.getParameter1());
		System.out.println("-----My parameter2:-----"+context.getParameter2());
	}

}

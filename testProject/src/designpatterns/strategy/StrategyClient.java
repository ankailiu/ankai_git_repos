package designpatterns.strategy;

public class StrategyClient {

	public static void main(String[] args) {
		
		//The first simple strategy.
		Context1 context = new Context1(new ConcreteStrategyA1());
		context.algorithm();
		
		context = new Context1(new ConcreteStrategyA2());
		context.algorithm();
		
		context = new Context1(new ConcreteStrategyA3());
		context.algorithm();
		
		
		//The second complex strategy.
		 Context2 context2 = new Context2(new ConcreteStrategyB1());  
	     context2.algorithm();  
	          
	     context2 = new Context2(new ConcreteStrategyB2(),100, 200);  
	     context2.algorithm();  
	          
	     context2 = new Context2(new ConcreteStrategyB3(), 100, 200);  
	     context2.algorithm();
	}

}

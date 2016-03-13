package designpatterns.strategy;

public class Context1 {
	
	AbstractStrategy1 strategy = null;
	
	public Context1(AbstractStrategy1 strategy){
		this.strategy = strategy;
	}
	
	public void algorithm(){
		this.strategy.algorithm();
	}

}

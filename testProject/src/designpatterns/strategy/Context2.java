package designpatterns.strategy;

public class Context2 {
	private AbstractStrategy2 strategy; 
	
	//parameter1,parameter2 only work for ConcreteStrategyB2,ConcreteStrategyB3 but ConcreteStrategyB1 doesn't need.
    private int parameter1;  
    private int parameter2;  
    
    private int count = 0;
    
    public Context2(AbstractStrategy2 strategy){
    	this.strategy = strategy;
    }
    
    public Context2(AbstractStrategy2 strategy,int parameter1,int parameter2){
    	this.strategy = strategy;
    	this.parameter1 = parameter1;
    	this.parameter2 = parameter2;
    }

	public int getParameter1() {
		return parameter1;
	}

	public void setParameter1(int parameter1) {
		this.parameter1 = parameter1;
	}

	public int getParameter2() {
		return parameter2;
	}

	public void setParameter2(int parameter2) {
		this.parameter2 = parameter2;
	}
	
	public void algorithm(){
		count ++;
		System.out.println("------------The"+count+"Call algorithm()--------");
		this.strategy.algoritm(this);
	}
	
	
	
    
    

}

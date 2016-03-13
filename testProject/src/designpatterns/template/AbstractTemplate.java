package designpatterns.template;

public abstract class AbstractTemplate {
	
	protected abstract void operation();
	
	protected void topOperation(){
		this.beforeOperation();
		operation();
		this.afterOperation();
	}
	
	private void beforeOperation(){  
	    System.out.println("This acton before the operation!");  
	} 
	
	private void afterOperation(){  
	    System.out.println("This acton after the operation!");  
	} 

}

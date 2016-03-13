package designpatterns.chainofresponsibility;

public abstract class AbstractHandler {
	
	//point to next handler.
	private AbstractHandler nextHandler;
	
	//an object which is going to be processed.
	protected Object value;
	
	public abstract boolean isInstanceOf();
	
	//process object.
	public abstract String handle();
	
	public final void setNextHandler(AbstractHandler nextHandler){
		this.nextHandler = nextHandler;
	}
	
	//cannot be overriden.
	public final String handleRequest(Object value){
		if(value == null){
			return null;
		}
		
		this.value = value;
		
		//If handler matched, return this.
		if(isInstanceOf()){
			return this.handle();
		}
		//If handler not matched, go to the next handler.
		if(nextHandler != null){
			return this.nextHandler.handleRequest(value);
		}
		
		//If no matched handler, just return null;
		return null;
	}

}

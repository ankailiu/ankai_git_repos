package designpatterns.bridge;

public abstract class Log {
	
	public ImplLog logImplementor;
	
	public void write(String message){
		logImplementor.execute(message);
	}

}

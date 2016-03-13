package designpatterns.command;

public class Invoker {
	
	private ICommand command = null;
	
	public ICommand getCommand(){
		return command;
	}
	
	public void setCommand(ICommand command){
		this.command = command;
	}
	
	public void runCommand(){
		this.command.execute();
	}

}

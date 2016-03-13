package designpatterns.command;

public class ConcreteCommand implements ICommand {
	
	private Receiver receiver;
	
	public ConcreteCommand(Receiver receiver){
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.action();
	}

}

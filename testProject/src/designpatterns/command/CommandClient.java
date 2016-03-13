package designpatterns.command;

public class CommandClient {

	public static void main(String[] args) {

		assemble();
		
	}
	
	public static void assemble(){
        final Receiver receiver = new Receiver();
        final ICommand command = new ConcreteCommand(receiver);
        final Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.runCommand();
    }

}

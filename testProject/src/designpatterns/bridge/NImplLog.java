package designpatterns.bridge;

public class NImplLog extends ImplLog {

	@Override
	public void execute(String msg) {
		System.out.println(msg);
	}

}

package designpatterns.bridge;

public class JImplLog extends ImplLog {

	@Override
	public void execute(String msg) {
		System.out.println(msg);
	}

}

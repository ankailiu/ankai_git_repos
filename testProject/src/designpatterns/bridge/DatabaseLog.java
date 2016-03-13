package designpatterns.bridge;

public class DatabaseLog extends Log {

	@Override
	public void write(String message) {
		this.logImplementor.execute(message);
	}

}

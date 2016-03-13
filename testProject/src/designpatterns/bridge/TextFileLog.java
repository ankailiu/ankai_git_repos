package designpatterns.bridge;

public class TextFileLog extends Log {

	@Override
	public void write(String message) {
		this.logImplementor.execute(message);
	}

}

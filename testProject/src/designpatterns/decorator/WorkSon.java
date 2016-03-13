package designpatterns.decorator;

public class WorkSon implements Work {

	@Override
	public void paint() {
		System.out.println("The sun has drawn a picture!");
	}

}

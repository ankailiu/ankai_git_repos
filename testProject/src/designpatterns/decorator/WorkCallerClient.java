package designpatterns.decorator;

public class WorkCallerClient {

	public static void main(String[] args) {
		
		Work work = new WorkFather(new WorkMather(new WorkSon()));
		work.paint();

	}

}

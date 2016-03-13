package designpatterns.decorator;

public class WorkDecorator implements Work {
	
	Work work;
	
	public WorkDecorator(Work work){
		this.work = work;
	}

	@Override
	public void paint() {
		work.paint();
	}

}

package designpatterns.decorator;

public class WorkMather extends WorkDecorator {

	public WorkMather(Work work) {
		super(work);
	}
	
	@Override
	public void paint(){
		super.paint();
		makeColorForPaint();
	}
	
	public void makeColorForPaint(){
		System.out.println("Mother make color for son's paint");
	}

}

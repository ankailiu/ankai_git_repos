package designpatterns.decorator;

public class WorkFather extends WorkDecorator  {

	public WorkFather(Work work) {
		super(work);
	}

	@Override
	public void paint() {
		super.paint();
		this.makeFrameForPaint();
	}
	
	public void makeFrameForPaint(){
		System.out.println("Father make a frame for son's paint!");
	}

}

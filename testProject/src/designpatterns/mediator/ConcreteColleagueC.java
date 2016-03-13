package designpatterns.mediator;

public class ConcreteColleagueC extends AbstractColleague {

	public ConcreteColleagueC(AbstractMediator mediator) {
		super(mediator);
		super.mediator.register(this);
	}

	@Override
	public void action() {
		System.out.println("CCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCCC");
	}

}

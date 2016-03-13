package designpatterns.mediator;

public class ConcreteColleagueB extends AbstractColleague {

	public ConcreteColleagueB(AbstractMediator mediator) {
		super(mediator);
		super.mediator.register(this);
	}

	@Override
	public void action() {
		System.out.println("BBBBBBBBBBBBBBBBBBBBBBBBBBBB");
	}

}

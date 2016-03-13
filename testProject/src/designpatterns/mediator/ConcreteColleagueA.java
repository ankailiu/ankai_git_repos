package designpatterns.mediator;

public class ConcreteColleagueA extends AbstractColleague {

	public ConcreteColleagueA(AbstractMediator mediator) {
		super(mediator);
		super.mediator.register(this);
	}

	@Override
	public void action() {
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAA");
	}

}

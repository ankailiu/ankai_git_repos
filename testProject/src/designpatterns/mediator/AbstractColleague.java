package designpatterns.mediator;

public abstract class AbstractColleague {
	
	protected AbstractMediator mediator;
	
	public AbstractColleague(AbstractMediator mediator){
		this.mediator = mediator;
	}
	
	public abstract void action();
	
	public void changed(){
		this.mediator.colleagueInfoChange(this);
	}

}

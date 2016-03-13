package designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends AbstractMediator {
	
	private List<AbstractColleague> colleagueList = new ArrayList<AbstractColleague>();

	@Override
	public void register(AbstractColleague ac) {
		colleagueList.add(ac);
	}

	@Override
	public void colleagueInfoChange(AbstractColleague ac) {
		for(AbstractColleague colleague : colleagueList){
			if(colleague != ac){
				colleague.action();
			}
		}

	}

}

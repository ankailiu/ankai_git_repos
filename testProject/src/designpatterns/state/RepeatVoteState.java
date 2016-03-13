package designpatterns.state;

public class RepeatVoteState implements VoteState {

	@Override
	public void vote(String user,String voteItem,VoteManagerContext voteManager) {
		//Repeat voting, give warning message, do nothing.
		System.out.println("Please don't repeat voting!");
	}

}

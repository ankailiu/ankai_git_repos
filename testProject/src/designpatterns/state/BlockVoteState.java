package designpatterns.state;

public class BlockVoteState implements VoteState {

	@Override
	public void vote(String user,String voteItem,VoteManagerContext voteManager) {
		// clear out the system.
		System.out.println("Your are on the black list, Your are forbidden to login in system!");
	}

}

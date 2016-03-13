package designpatterns.state;

public class NormalVoteState implements VoteState {

	@Override
	public void vote(String user,String voteItem,VoteManagerContext voteManager) {
		voteManager.getMapVote().put(user, voteItem);
		System.out.println("Welcome your vote!");
	}

}

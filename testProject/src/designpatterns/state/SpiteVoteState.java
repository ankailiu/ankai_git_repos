package designpatterns.state;

public class SpiteVoteState implements VoteState {

	@Override
	public void vote(String user,String voteItem,VoteManagerContext voteManager) {
        String str = voteManager.getMapVote().get(user);
        if(str != null){
            voteManager.getMapVote().remove(user);
        }
		System.out.println("Spite Voting! We will revoke your vote! your vote will be abandon.");
	}

}

package designpatterns.state;

public interface VoteState {
	
	void vote(String user,String voteItem,VoteManagerContext voteManager);

}

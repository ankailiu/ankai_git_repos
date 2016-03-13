package designpatterns.state;

public class StateClient {

	public static void main(String[] args) {
	    VoteManagerContext vm = new VoteManagerContext();
        for(int i=0;i<9;i++){
            vm.vote("u1","A");
        }
	}

}

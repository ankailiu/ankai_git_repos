package designpatterns.memento;

public class Originator {
	private int number = 0 ;
	
	public Originator(int number){
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	//add originator snapshot into memento.
	public Memento createMemento(){
		return new Memento(this);
	}
	
	//reset to original value.
	public void restoreToMemento(Memento memento){
		this.number = memento.number;
	}
	
	
}

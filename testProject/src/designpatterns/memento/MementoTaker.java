package designpatterns.memento;

public class MementoTaker {
	
	private Memento memento;
	
	public Memento getMemento(){
		return this.memento;
	}
	
	public void saveMemento(Memento memento){
		this.memento = memento;
	}

}

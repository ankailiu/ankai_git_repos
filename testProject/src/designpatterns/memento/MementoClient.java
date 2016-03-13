package designpatterns.memento;

public class MementoClient {

	public static void main(String[] args) {
		
		//original value set to 10
		Originator originator = new Originator(10);
		System.out.println("originator current value is :"+originator.getNumber());
		
		//make memento.
		Memento memento = originator.createMemento();
		MementoTaker taker = new MementoTaker();
		taker.saveMemento(memento);
		
		//change value to 20.
		originator.setNumber(20);
		System.out.println("originator current value is :"+originator.getNumber());
		
		//want to reset its current value 20 to original value 10.
		originator.restoreToMemento(taker.getMemento());
		System.out.println("originator current value is :"+originator.getNumber());

	}

}

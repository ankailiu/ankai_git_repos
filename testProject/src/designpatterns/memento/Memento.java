package designpatterns.memento;

import java.io.Serializable;

public class Memento implements Serializable {

	private static final long serialVersionUID = 5143733745508967350L;
	
	public int number;
	
	public Memento(Originator originator){
		this.number = originator.getNumber();
	}

}

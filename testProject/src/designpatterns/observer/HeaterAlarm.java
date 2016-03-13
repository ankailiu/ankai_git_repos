package designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class HeaterAlarm implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		if(((Heater)o).getTemperature() == 100){
			this.makeAlarm();
		}
	}
	
	public void makeAlarm(){
		System.out.println("water has been boiled.!!!!");
	}

}

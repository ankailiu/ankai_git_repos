package designpatterns.observer;

public class ObserverClient {

	public static void main(String[] args) {
		//Heater is the subject which need to be watched by heater display and heater alarm.
		Heater heater = new Heater();
		
		//heater display and alarm are the observers to the heater.
		HeaterDisplay display = new HeaterDisplay();
		HeaterAlarm alarm = new HeaterAlarm();
		
		//to register the observer to the heater.
		heater.addObserver(display);
		heater.addObserver(alarm);
		
		heater.boilWater();
	}

}

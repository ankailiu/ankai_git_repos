package designpatterns.observer;

import java.util.Observable;
import java.util.Observer;

public class HeaterDisplay implements Observer {
	
	String status = "Not boiled";

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	private void displayTemperature(int temperature){
		System.out.println("Current temperature is "+temperature);
	}

	@Override
	public void update(Observable o, Object arg) {
		if(((Heater)o).getTemperature() > 95){
			this.setStatus("Boiled");
			displayTemperature(((Heater)o).getTemperature());
		}

	}

}

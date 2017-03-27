package maestro.headfirst.experiments2.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	
	
	private float temperature;
	private float humidity;
	private Observable observable;
	
	
	
	// The constructor is passed the weatherData object
	// (the Subject) and we use it to register
	// the display as an observer.
	CurrentConditionsDisplay(Observable observable){
		this.observable = observable;
		this.observable.addObserver(this);
	}

	@Override
	public void display() {
		// The display method just prints out the most recent temp and humidity
		System.out.println("Current conditions: " + this.temperature +"F degrees and " +
		this.humidity + "% humidity");

	}

	@Override
	public void update(Observable obs, Object arg) {
		
		if ( obs instanceof WeatherData ){
			WeatherData weatherData = (WeatherData) obs;
			
			// When update() is called, we save the temperature and humidity and call 
			// display().
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
			
		}


	}

}

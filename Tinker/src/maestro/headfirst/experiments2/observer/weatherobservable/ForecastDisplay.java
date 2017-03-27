package maestro.headfirst.experiments2.observer.weatherobservable;


import java.util.*;

public class ForecastDisplay implements Observer, DisplayElement {
	private float currentPressure = 29.92f;  
	private float lastPressure;
	private Observable observable;

	public ForecastDisplay(Observable observable) {
		this.observable =  observable;
		this.observable.addObserver(this);
		
	}

	public void update(Observable obs, Object arg) {

		if ( obs instanceof WeatherData ){
			WeatherData weatherData = (WeatherData) obs;
			
			// When update() is called, we save the temperature and humidity and call 
			// display().
			this.lastPressure = this.currentPressure;
			this.currentPressure = weatherData.getPressure();
			display();
			
		}
	}

	public void display() {
		System.out.print("Forecast: ");
		if (currentPressure > lastPressure) {
			System.out.println("Improving weather on the way!");
		} else if (currentPressure == lastPressure) {
			System.out.println("More of the same");
		} else if (currentPressure < lastPressure) {
			System.out.println("Watch out for cooler, rainy weather");
		}
	}
}

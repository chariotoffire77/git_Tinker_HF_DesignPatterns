package maestro.headfirst.experiments2.observer.weatherobservable;


import java.util.Observable;

public class WeatherData extends Observable
{
	

	private float temperature, humidity, pressure;
	
	WeatherData(){

	}

	
	// We notify the Observers when we get updated measurements
	// from the WeatherStation.
	public void measurementsChanged(){
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements( float temperature, float humidity, float pressure){
		/*
		 * Okay, while we wanted to ship a nice little weather station with each book, the 
		 * publisher wouldn't go for it. So, rather than reading actual weather data off
		 * a device, we're going to use this method to test our display elements.
		 * Or, for fun, you could write code to grab measurements off the web.
		 */
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();
	}


	public float getTemperature() {
		return temperature;
	}


	public float getHumidity() {
		return humidity;
	}


	public float getPressure() {
		return pressure;
	}
		

}

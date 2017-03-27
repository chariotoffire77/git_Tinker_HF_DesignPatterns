package maestro.headfirst.experiments2.observer.weatherobservable;

public class WeatherStation {

	public static void main(String[] args) {
		// First create the WeatherData object, it is a subject
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditionsDisplay = 
				new CurrentConditionsDisplay(weatherData);
		
		
		ForecastDisplay forecastDisplay = new ForecastDisplay( weatherData );
		
		
		
		
		
		// Simulate new weather measurements
		weatherData.setMeasurements(80, 65,  30.4f);
		
		weatherData.setMeasurements(82, 70,  29.2f);

		weatherData.setMeasurements(78, 90,  29.2f);

	}

}

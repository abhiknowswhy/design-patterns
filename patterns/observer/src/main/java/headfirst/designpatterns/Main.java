package headfirst.designpatterns;

import headfirst.designpatterns.Observable.WeatherData;
import headfirst.designpatterns.Observer.CurrentConditionsDisplay;
import headfirst.designpatterns.Observer.ForecastDisplay;
import headfirst.designpatterns.Observer.HeatIndexDisplay;
import headfirst.designpatterns.Observer.StatisticsDisplay;

public class Main {

	public static void main(String[] args) {

		WeatherData weatherData = new WeatherData();

		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(); 
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(); 
		ForecastDisplay forecastDisplay = new ForecastDisplay(); 
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(); 

		currentDisplay.registerObserver(weatherData);
		statisticsDisplay.registerObserver(weatherData);
		forecastDisplay.registerObserver(weatherData);
		heatIndexDisplay.registerObserver(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);

		weatherData.removeObserver(forecastDisplay);
		weatherData.setMeasurements(78, 90, 29.2f);
		weatherData.setMeasurements(82, 70, 29.2f);

		forecastDisplay.registerObserver(weatherData);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}

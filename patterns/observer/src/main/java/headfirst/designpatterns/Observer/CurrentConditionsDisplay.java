package headfirst.designpatterns.Observer;

import headfirst.designpatterns.Observable.WeatherData;
import headfirst.designpatterns.Observer.Display.DisplayElement;

public class CurrentConditionsDisplay implements Observer<WeatherData>, DisplayElement {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	public CurrentConditionsDisplay() {}

	@Override
	public void registerObserver(WeatherData weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void removeObserver(){
		weatherData.removeObserver(this);
		weatherData = null;
	}

	@Override
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}

}

package headfirst.designpatterns.Observer;

import headfirst.designpatterns.Observable.WeatherData;
import headfirst.designpatterns.Observer.Display.DisplayElement;

public class StatisticsDisplay implements Observer<WeatherData>, DisplayElement {
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private float tempSum= 0.0f;
	private int numReadings;
	private WeatherData weatherData;

	public StatisticsDisplay() {}

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
	public void update(float temp, float humidity, float pressure) {
		tempSum += temp;
		numReadings++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}

		if (temp < minTemp) {
			minTemp = temp;
		}

		display();
	}

	@Override
	public void display() {
		System.out.println("Avg/Max/Min temperature = " + (tempSum / numReadings)
			+ "/" + maxTemp + "/" + minTemp);
	}
}

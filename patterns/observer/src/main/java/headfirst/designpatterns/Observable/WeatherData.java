package headfirst.designpatterns.Observable;

import java.util.ArrayList;
import java.util.List;

import headfirst.designpatterns.Observer.Observer;

@SuppressWarnings("rawtypes")
public class WeatherData implements Observable {
	private final List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
	
	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}
	
	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
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

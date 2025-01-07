package headfirst.designpatterns.Observer;

public interface Observer <T>{
	public void update(float temp, float humidity, float pressure);
	public void registerObserver(T observable);
	public void removeObserver();
}

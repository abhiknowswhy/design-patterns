package headfirst.designpatterns.Observable;

import headfirst.designpatterns.Observer.Observer;

@SuppressWarnings("rawtypes")
public interface Observable {
	public void registerObserver(Observer observer);
	public void removeObserver(Observer observer);
	public void notifyObservers();
}

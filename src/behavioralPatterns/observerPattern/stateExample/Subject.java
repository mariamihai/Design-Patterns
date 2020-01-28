package behavioralPatterns.observerPattern.stateExample;

import java.util.ArrayList;
import java.util.List;

public class Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	
	
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer o) {
		observers.add(o);
	}
	public void detach(Observer o) {
		observers.remove(o);
	}
	
	public void notifyAllObservers() {
		observers.stream().forEach(o -> o.update());
	}
}

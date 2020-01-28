package behavioralPatterns.statePattern.startStopExample;

public class StopState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("Stoping.");
		context.setState(this);
	}
	
	public String toString() {
		return "Stop State";
	}
}

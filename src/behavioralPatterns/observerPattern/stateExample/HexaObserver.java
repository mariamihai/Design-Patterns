package behavioralPatterns.observerPattern.stateExample;

public class HexaObserver extends Observer {

	private String hexaState = "";
	
	public HexaObserver(Subject subject) {
		super(subject);
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("The hexa Observer was notified.");
		int state = subject.getState();
		hexaState = Integer.toHexString(state);
	}

	@Override
	public String toString() {
		return "HexaObserver [hexaState=" + hexaState + "]";
	}	
}

package behavioralPatterns.observerPattern.stateExample;

public class BinaryObserver extends Observer {

	private String binaryState = "";
	
	public BinaryObserver(Subject subject) {
		super(subject);
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("The binary Observer was notified.");
		int state = subject.getState();
		binaryState = Integer.toBinaryString(state);
	}

	@Override
	public String toString() {
		return "BinaryObserver [binaryState=" + binaryState + "]";
	}
}

package behavioralPatterns.observerPattern.stateExample;

public class OctalObserver extends Observer {

	private String octalState = "";
	
	public OctalObserver(Subject subject) {
		super(subject);
		subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("The octal Observer was notified.");
		int state = subject.getState();
		octalState = Integer.toOctalString(state);
	}

	@Override
	public String toString() {
		return "OctalObserver [octalState=" + octalState + "]";
	}
}

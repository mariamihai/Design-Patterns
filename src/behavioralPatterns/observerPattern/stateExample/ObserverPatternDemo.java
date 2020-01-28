package behavioralPatterns.observerPattern.stateExample;

public class ObserverPatternDemo {

	public static void main(String[] args) {
		Subject subject = new Subject();
		Observer observer1 = new BinaryObserver(subject);
		Observer observer2 = new OctalObserver(subject);
		Observer observer3 = new HexaObserver(subject);
		
		subject.setState(1);
		
		System.out.println();		
		System.out.println(observer1.toString());
		System.out.println(observer2.toString());
		System.out.println(observer3.toString());
		
		subject.setState(3);
		
		System.out.println();		
		System.out.println(observer1.toString());
		System.out.println(observer2.toString());
		System.out.println(observer3.toString());
	}

}

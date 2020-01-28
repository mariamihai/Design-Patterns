package creationalPatterns.singleton;

class Singleton5 {
	private static Singleton5 instance;
	
	private Singleton5() {}

	
	public static synchronized Singleton5 getInstance() {
		if(instance == null) {
			instance = new Singleton5();
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Ta daaaaaaa");
	}
}

public class SingletonPatternDemoMethodSynchronization {
	public static void main(String[] args) {
		Singleton5 singletonInstance = Singleton5.getInstance();
		singletonInstance.showMessage();
	}
}

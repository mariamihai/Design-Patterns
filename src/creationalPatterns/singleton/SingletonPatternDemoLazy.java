package creationalPatterns.singleton;

class Singleton2 {
	private static Singleton2 instance;
	
	private Singleton2() {}
	
	public static Singleton2 getInstance() {
		if(instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Ta daaaaaaa (again)");
	}
}

public class SingletonPatternDemoLazy {
	public static void main(String[] args) {
		Singleton3 singletonInstance = Singleton3.getInstance();
		singletonInstance.showMessage();
	}
}
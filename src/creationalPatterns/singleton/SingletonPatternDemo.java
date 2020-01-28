package creationalPatterns.singleton;

class Singleton1 {
	private static Singleton1 instance = new Singleton1();
	
	private Singleton1() {}
	
	public static Singleton1 getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Ta daaaaaaa");
	}
}

public class SingletonPatternDemo {
	public static void main(String[] args) {
		Singleton1 singletonInstance = Singleton1.getInstance();
		singletonInstance.showMessage();
	}
}
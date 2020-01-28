package creationalPatterns.singleton;

class Singleton3 {
	private static volatile Singleton3 instance;
	private static Object mutex = new Object();
	
	private Singleton3() {}
	
	public static Singleton3 getInstance() {
		Singleton3 result = instance;
		
		if(result == null) {
			synchronized (mutex) {
				result = instance;
				if(result == null) {
					instance = result = new Singleton3();
				}
			}
		}
		
		// result is used to improve performance
		return result;
	}
	
	public void showMessage() {
		System.out.println("Ta daaaaaaa (again and again)");
	}
}

public class SingletonPatternDemoSynchronized {
	public static void main(String[] args) {
		Singleton3 singletonInstance = Singleton3.getInstance();
		singletonInstance.showMessage();
	}
}
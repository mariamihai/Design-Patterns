package creationalPatterns.singleton;

class Singleton4 {
	private static Singleton4 instance;
	
	private Singleton4() {}
	
	static {
		 instance = new Singleton4();
	}
	
	public static Singleton4 getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Ta daaaaaaa");
	}
}

public class SingletonPetternDemoStaticBlock {
	public static void main(String[] args) {
		Singleton4 singletonInstance = Singleton4.getInstance();
		singletonInstance.showMessage();
	}
}
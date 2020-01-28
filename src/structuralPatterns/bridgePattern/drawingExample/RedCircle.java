package structuralPatterns.bridgePattern.drawingExample;

public class RedCircle implements DrawAPI {

	@Override
	public void drawCircle() {
		System.out.println("Drawing a red circle.");
	}
}

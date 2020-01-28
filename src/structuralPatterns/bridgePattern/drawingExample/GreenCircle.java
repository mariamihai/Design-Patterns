package structuralPatterns.bridgePattern.drawingExample;

public class GreenCircle implements DrawAPI {

	@Override
	public void drawCircle() {
		System.out.println("Drawing a green circle.");
	}
}

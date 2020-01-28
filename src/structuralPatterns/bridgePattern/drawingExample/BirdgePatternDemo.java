package structuralPatterns.bridgePattern.drawingExample;

public class BirdgePatternDemo {

	public static void main(String[] args) {
		DrawAPI drawAPI1 = new RedCircle();		
		Shape s1 = new Circle(drawAPI1);
		s1.draw();
		
		DrawAPI drawAPI2 = new GreenCircle();		
		Shape s2 = new Circle(drawAPI2);
		s2.draw();
	}

}

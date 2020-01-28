package creationalPatterns.prototype.shapesCache;

public class Rectangle extends Shape {
	public Rectangle () {
		type = "rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle.");
	}
}

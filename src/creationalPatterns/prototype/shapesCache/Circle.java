package creationalPatterns.prototype.shapesCache;

public class Circle extends Shape {

	public Circle () {
		type = "circle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle.");
	}
}

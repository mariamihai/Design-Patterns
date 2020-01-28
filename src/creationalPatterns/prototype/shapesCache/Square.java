package creationalPatterns.prototype.shapesCache;

public class Square extends Shape {
	public Square () {
		type = "square";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a square.");
	}
}

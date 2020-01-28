package creationalPatterns.factoryMethod.getShapes;

import creationalPatterns.factoryMethod.getShapes.shapes.Circle;
import creationalPatterns.factoryMethod.getShapes.shapes.Rectangle;
import creationalPatterns.factoryMethod.getShapes.shapes.Shape;
import creationalPatterns.factoryMethod.getShapes.shapes.Square;

public class ShapeFactory {

	public Shape getShape(String shape) {
		switch(shape.toLowerCase()) {
			case "circle": return new Circle();
			case "square": return new Square(); 
			//case "rectangle": new Rectangle();
			default: return new Rectangle();
		}
	}
}

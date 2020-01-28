package creationalPatterns.factoryMethod.getShapes;

import creationalPatterns.factoryMethod.getShapes.shapes.Shape;

public class FactoryPatternDemo {

	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		Shape shape1 = factory.getShape("CIRCLE");
		shape1.draw();
		Shape shape2 = factory.getShape("SQUARE");
		shape2.draw();
		Shape shape3 = factory.getShape("RECTANGLE");
		shape3.draw();
	}

}

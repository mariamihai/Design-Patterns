package structuralPatterns.decoratorPattern.shapesExample;

import structuralPatterns.decoratorPattern.shapesExample.shapes.Shape;

public class RedShapeDecorator extends ShapeDecorator {

	
	public RedShapeDecorator(Shape shape) {
		super(shape);
	}
	
	@Override
	public void draw() {
		shape.draw();
		setRedBorder(shape);
		System.out.println("Drawing the selected shape and adding a red border to it.");
	}

	public void setRedBorder(Shape shape) {
		System.out.println("Red border added for selected shape.");
	}
}

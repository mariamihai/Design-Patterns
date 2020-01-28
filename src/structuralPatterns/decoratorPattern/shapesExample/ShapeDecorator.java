package structuralPatterns.decoratorPattern.shapesExample;

import structuralPatterns.decoratorPattern.shapesExample.shapes.Shape;

public abstract class ShapeDecorator implements Shape {

	protected Shape shape;
	
	public ShapeDecorator(Shape shape) {
		this.shape = shape;
	}

	@Override
	public abstract void draw();
}

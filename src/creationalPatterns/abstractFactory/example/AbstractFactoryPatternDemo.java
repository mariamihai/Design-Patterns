package creationalPatterns.abstractFactory.example;

import creationalPatterns.abstractFactory.example.colors.Color;
import creationalPatterns.abstractFactory.example.shapes.Shape;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		FactoryProducer producer = new FactoryProducer();
		AbstractFactory shapeFactory = producer.getFactory("shape");
		Shape shape = shapeFactory.getShape("rectangle");
		shape.draw();

		AbstractFactory colorFactory = producer.getFactory("color");
		Color color = colorFactory.getColor("red");
		color.fill();
	}

}

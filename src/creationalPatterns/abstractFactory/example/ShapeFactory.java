package creationalPatterns.abstractFactory.example;

import creationalPatterns.abstractFactory.example.colors.Color;
import creationalPatterns.abstractFactory.example.shapes.*;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String type) {
		if(type == null) return null;
		
		switch (type.toLowerCase()) {
			case "circle": return new Circle();
			case "square": return new Square();
			case "rectangle": return new Rectangle();
		}
		
		return null;
	}

	@Override
	public Color getColor(String type) {
		return null;
	}

}

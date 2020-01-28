package creationalPatterns.abstractFactory.example;

import creationalPatterns.abstractFactory.example.colors.*;
import creationalPatterns.abstractFactory.example.shapes.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Shape getShape(String type) {
		return null;
	}

	@Override
	public Color getColor(String type) {
		if(type == null) return null;
		
		switch (type.toLowerCase()) {
			case "red":
				return new Red();
			case "green":
				return new Green();
			case "blue":
				return new Blue();
		}
		
		return null;
	}

}

package creationalPatterns.abstractFactory.example;

import creationalPatterns.abstractFactory.example.colors.Color;
import creationalPatterns.abstractFactory.example.shapes.Shape;

public abstract class AbstractFactory {

	public abstract Shape getShape(String type);
	public abstract Color getColor(String type);
}

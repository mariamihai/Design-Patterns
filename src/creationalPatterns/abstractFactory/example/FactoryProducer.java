package creationalPatterns.abstractFactory.example;

public class FactoryProducer {

	public AbstractFactory getFactory(String type) {
		if("color".equals(type.toLowerCase())) return new ColorFactory();
		else return new ShapeFactory();
	}
}

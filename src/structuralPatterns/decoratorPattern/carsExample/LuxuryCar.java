package structuralPatterns.decoratorPattern.carsExample;

public class LuxuryCar extends CarDecorator {

	public LuxuryCar(Car car) {
		super(car);
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding features of Luxury Car.");
	}

	
}

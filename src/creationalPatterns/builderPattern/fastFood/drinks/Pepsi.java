package creationalPatterns.builderPattern.fastFood.drinks;

public class Pepsi extends Drink{
	
	@Override
	public String name() {
		return "Pepsi";
	}

	@Override
	public Double price() {
		return 1.11;
	}
}

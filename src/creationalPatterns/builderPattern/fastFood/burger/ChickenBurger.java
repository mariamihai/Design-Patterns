package creationalPatterns.builderPattern.fastFood.burger;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "Chicken burger";
	}

	@Override
	public Double price() {
		return 3.33;
	}
}

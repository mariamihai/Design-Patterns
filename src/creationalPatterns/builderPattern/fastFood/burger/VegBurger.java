package creationalPatterns.builderPattern.fastFood.burger;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg burger";
	}

	@Override
	public Double price() {
		return 4.44;
	}
}

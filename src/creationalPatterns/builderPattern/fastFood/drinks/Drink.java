package creationalPatterns.builderPattern.fastFood.drinks;

import creationalPatterns.builderPattern.fastFood.Item;
import creationalPatterns.builderPattern.fastFood.pack.BootlePack;
import creationalPatterns.builderPattern.fastFood.pack.Packing;

public abstract class Drink implements Item {

//	private Integer quantity = 0;
	private Boolean hasCubes = false;

//	public void setQuantity(Integer quantity) {
//		this.quantity = quantity;
//	}

	public void setHasCubes(Boolean hasCubes) {
		this.hasCubes = hasCubes;
	}

	public Packing pack() {
		return new BootlePack();
	}

	@Override
	public abstract Double price();
}

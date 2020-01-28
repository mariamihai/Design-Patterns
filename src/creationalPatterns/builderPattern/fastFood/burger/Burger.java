package creationalPatterns.builderPattern.fastFood.burger;

import creationalPatterns.builderPattern.fastFood.Item;
import creationalPatterns.builderPattern.fastFood.pack.Packing;
import creationalPatterns.builderPattern.fastFood.pack.WrapPack;

public abstract class Burger implements Item {

//	private String quantity = "small";

//	public void setQuantity(String quantity) {
//		this.quantity = quantity;
//	}

	@Override
	public Packing pack() {
		return new WrapPack();
	}

	@Override
	public abstract Double price();
}

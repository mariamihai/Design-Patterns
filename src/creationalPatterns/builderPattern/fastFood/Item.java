package creationalPatterns.builderPattern.fastFood;

import creationalPatterns.builderPattern.fastFood.pack.Packing;

public interface Item {

	String name();
	Double price();
	Packing pack();
}

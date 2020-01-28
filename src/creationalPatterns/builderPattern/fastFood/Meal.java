package creationalPatterns.builderPattern.fastFood;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Meal {

	private List<Item> items;
	
	public Meal() {
		items = new ArrayList<Item>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public Double getCost() {
		return items.stream().collect(Collectors.summingDouble(i -> i.price()));
//		return items.stream().mapToDouble(i -> i.price()).sum();
	}
	
	public void showItems() {
		items.stream().forEach(i -> System.out.println(i.name() + " - " + i.price()));
	}
	
}

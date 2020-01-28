package creationalPatterns.builderPattern.fastFood;

import creationalPatterns.builderPattern.fastFood.burger.ChickenBurger;
import creationalPatterns.builderPattern.fastFood.burger.VegBurger;
import creationalPatterns.builderPattern.fastFood.drinks.Coke;
import creationalPatterns.builderPattern.fastFood.drinks.Pepsi;

public class MealBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		
		Item vegBurger = new VegBurger();
		vegBurger.pack();
		Item drinkCoke = new Coke();
		meal.addItem(drinkCoke);
		meal.addItem(vegBurger);
		
		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		
		Item chickenBurger = new ChickenBurger();
		chickenBurger.pack();
		Item drinkPepsi = new Pepsi();
		meal.addItem(drinkPepsi);
		meal.addItem(chickenBurger);
		
		return meal;
	}
	
	public Meal preparesMeal2WithJava8 () {
		Meal meal = new Meal();
		
		Item vegBurger = new VegBurger();
		vegBurger.pack();
		Item drinkCoke1 = new Coke();
		meal.addItem(drinkCoke1);
		meal.addItem(vegBurger);		
		Item chickenBurger = new ChickenBurger();
		chickenBurger.pack();
		Item drinkCoke2 = new Coke();
		meal.addItem(drinkCoke2);
		meal.addItem(chickenBurger);
		
		return meal;
	}
}

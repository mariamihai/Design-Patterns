package creationalPatterns.builderPattern.fastFood;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		MealBuilder buildMenu = new MealBuilder();
		
		// Create a vegetarian menu
		Meal vegMeal = buildMenu.prepareVegMeal();
		System.out.println(" --- Vegetarian Menu: --- ");
		vegMeal.showItems();
		System.out.println(" Cost of menu: " + vegMeal.getCost());
		
		System.out.println("\n");
		
		// Create a non-vegetarian menu
		Meal nonVegMeal = buildMenu.prepareVegMeal();
		System.out.println(" --- Non-vegetarian Menu: --- ");
		nonVegMeal.showItems();
		System.out.println(" Cost of menu: " + nonVegMeal.getCost());

		System.out.println("\n");
		
		// Create 2 veg menus with Cokes menu
		Meal menus = buildMenu.preparesMeal2WithJava8();
		System.out.println(" --- 2 Menus: --- ");
		menus.showItems();
		System.out.println(" Cost of menu: " + menus.getCost());
	}

}

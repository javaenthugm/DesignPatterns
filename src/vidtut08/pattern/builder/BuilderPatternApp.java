package vidtut08.pattern.builder;

public class BuilderPatternApp {
	public static void main(String args[]){
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal");
		vegMeal.displayItems();
		Meal nVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non Veg Meal");
		nVegMeal.displayItems();
	}
}

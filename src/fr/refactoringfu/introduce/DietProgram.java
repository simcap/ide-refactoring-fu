package fr.refactoringfu.introduce;

import java.util.HashMap;
import java.util.Map;

public class DietProgram {
	
	private Map<String, NutritionFacts> diets = new HashMap<String, NutritionFacts>();

	public DietProgram() {
		NutritionFacts normalServings = new NutritionFacts(1, 1);
		NutritionFacts highCalories = new NutritionFacts(1, 1, 10);
		NutritionFacts highFat = new NutritionFacts(1, 1, 0, 30);
		NutritionFacts averageSodium = new NutritionFacts(1, 1, 0, 0, 5);
		NutritionFacts lowCarbohydrate = new NutritionFacts(1, 1, 0, 0, 0, 40);
		
		diets.put("servings", normalServings);
		diets.put("calories", highCalories);
		diets.put("high", highFat);
		diets.put("average", averageSodium);
		diets.put("low", lowCarbohydrate);
	}
}

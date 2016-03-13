package multi.parameters.constructor;

public class NutritionFactsClient {

	public static void main(String[] args) {
		//This is a good practice to construct a constructor for NutritionFacts
		NutritionFacts cocaCola = new NutritionFacts
									.Builder(240, 8)
									.calories(100).sodium(35).carbohydrate(27).fat(12)
									.build();
	}

}

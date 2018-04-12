package animal.diet;

import animal.Food;

public abstract class Diet {
	public void eat(Food food) {
		System.out.println("is eating " + food.getName());
	};

}

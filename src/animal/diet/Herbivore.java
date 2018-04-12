package animal.diet;

import animal.Food;
import animal.Plant;

public class Herbivore extends Diet {
	public void eat(Plant food) {
		eat((Food) food);
	}
}

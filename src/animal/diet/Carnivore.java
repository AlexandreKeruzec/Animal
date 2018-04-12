package animal.diet;

import animal.Food;
import animal.Meat;

public class Carnivore extends Diet {
	public void eat(Meat food) {
		eat((Food) food);
	}
}

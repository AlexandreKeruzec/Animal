package animal.animals;

import animal.Animal;
import animal.diet.Carnivore;

public class Lion extends Animal {

	public Lion(String name, int age, float weight, float size) {
		super(name, age, weight, size, new Carnivore());
	}

}

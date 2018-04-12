package animal.animals;

import animal.Animal;
import animal.diet.Omnivore;

public class Human extends Animal {

	public Human(String name, int age, float weight, float size) {
		super(name, age, weight, size, new Omnivore());
	}

}

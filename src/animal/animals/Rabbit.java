package animal.animals;

import animal.Animal;
import animal.diet.Herbivore;

public class Rabbit extends Animal {

	public Rabbit(String name, int age, float weight, float size) {
		super(name, age, weight, size, new Herbivore());
	}

}

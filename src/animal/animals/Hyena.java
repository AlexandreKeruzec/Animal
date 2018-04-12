package animal.animals;

import animal.Animal;
import animal.diet.Carnivore;

public class Hyena extends Animal {

	public Hyena(String name, int age, float weight, float size) {
		super(name, age, weight, size, new Carnivore());
	}

}

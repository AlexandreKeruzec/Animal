package animal;

import animal.animals.Lion;
import animal.animals.Rabbit;

public class Test {

	public static void main(String[] args) {
		Plant plant = new Plant("grass");
		Meat meat = new Meat("steak");
		
		Rabbit rabbit = new Rabbit("lapin de garenne", 1, 2f, 0.45f);
		Lion lion = new Lion("lion", 5, 190f, 2.1f);
		
		rabbit.eat(plant);
		lion.eat(meat);
		
		lion.eat(rabbit);		
	}

}

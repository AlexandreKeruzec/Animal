package animal;

public abstract class Animal {
	private int age;
	private float weight;
	private float size;
	private String name;
	
	public void eat(Food food) {}
	public void move() {}
	
	public Animal(int age, float weight, float size, String name) {
		super();
		this.age = age;
		this.weight = weight;
		this.size = size;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}

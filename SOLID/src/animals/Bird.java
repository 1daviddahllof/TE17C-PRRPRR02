package animals;

public abstract class Bird extends Animal {

	public Bird(String color, String descpriton) {
		super(color, descpriton);
	}

	public void speak() {
		System.out.println(this.getClass().getSimpleName() + " is chirping!");
	}

	public void sleep() {
		System.out.println(this.getClass().getSimpleName() + " is sleeping!");
	}

	public void eat() {
		System.out.println(this.getClass().getSimpleName() + " is peck-peck-pecking away!");
	}
}

package animals;
import interfaces.IDogMotions;

public class Dog extends Animal implements IDogMotions{

    public Dog(String color, String descpriton)  {
        super(color,descpriton);
    }

    public void speak() {
        System.out.println("Dog is barking!");
    }

    public void sleep() {
        System.out.println("Dog is sleeping!");
    }

    public void eat() {
        System.out.println("Dog is eating.");
    }
    
    public void move() {
    	skip();
    	jump();
    	swim();
    	run();
    	sit();
    	dash();
    	roll();
    }

    @Override
    public void skip() {
        System.out.println("Dog is happy!");
    }

    @Override
    public void jump() {
        System.out.println("Dog is agile!");
    }

    @Override
    public void swim() {
        System.out.println("Dog is swimming!");
    }

    @Override
    public void run() {
        System.out.println("Dog running!");
    }

    @Override
    public void roll() {
        System.out.println("Who's a good boi!");
    }

    @Override
    public void sit() {
        System.out.println("Staaaaay!");
    }

    @Override
    public void dash() {
        System.out.println("Dog so fast!");
    }
}

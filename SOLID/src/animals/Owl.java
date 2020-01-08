package animals;
import interfaces.IOwlMotions;

public class Owl extends Bird implements IOwlMotions{

    public Owl(String color, String descpriton)  {
        super(color,descpriton);
    }
    
    public void move() {
    	skip();
    	jump();
    	sit();
    	fly();
    }


    @Override
    public void sit() {
        System.out.println("Owl is squatting on dem eggs!");
    }
    
    @Override
    public void jump() {
        System.out.println("Owl is jumping!");
    }
    
    @Override
    public void fly() {
        System.out.println("Owl is gliding silently through the air!");
    }

    @Override
    public void skip() {
        System.out.println("Owl is skipping and hopping!");
    }
}

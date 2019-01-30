package OOP_Test.inheritance;

public class Wizard extends Hero {
    public  Wizard(String name){
        super(name);
    }

    @Override
    public int getDamage() {
        return 20;
    }
}

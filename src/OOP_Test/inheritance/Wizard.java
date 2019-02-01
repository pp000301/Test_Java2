package OOP_Test.inheritance;

public class Wizard extends Hero {
    public  Wizard(String name, int healht){
        super(name, healht);
    }

    @Override
    public int getDamage() {
        return 20;
    }
}

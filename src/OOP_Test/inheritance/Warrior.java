package OOP_Test.inheritance;

public class Warrior extends  Hero{
    public  Warrior(String name, int health){
        super(name,health);
    }

    @Override
    public int getDamage() {
        return 10;
    }
}

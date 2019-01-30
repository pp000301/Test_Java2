package OOP_Test.inheritance;

public class Warrior extends  Hero{
    public  Warrior(String name){
        super(name);
    }

    @Override
    public int getDamage() {
        return 10;
    }
}

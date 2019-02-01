package OOP_Test.inheritance;

import OOP_Test.polymorphism.Mortaleable;

public class Enemy implements Mortaleable {


    private int health;

    public Enemy(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int takeDamage(int damage){
        this.health-=damage;
        return health;
    }

    public int getHealth() {
        System.out.println("Остаточное здоровье : "+ health);
        return health;
    }


    @Override
    public boolean isAlive() {
        return health> 0;
    }
}

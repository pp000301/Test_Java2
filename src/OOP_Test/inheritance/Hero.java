package OOP_Test.inheritance;

import OOP_Test.polymorphism.Mortaleable;

public abstract class Hero implements Mortaleable {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health=health;
    }

    public String getName(String name) {
        this.name = name;
        return this.name;
    }

    public abstract int getDamage();

    public void attackEnemy(Enemy enemy) {
        System.out.println("герой " + this.name + " атакует врага на " + this.getDamage());
        enemy.takeDamage(getDamage());
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}

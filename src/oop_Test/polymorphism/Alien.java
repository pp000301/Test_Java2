package oop_Test.polymorphism;

import oop_Test.inheritance.Enemy;

public class Alien extends Enemy{

    public Alien(int health) {
        super(health);
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public int takeDamage(int damage) {
        return super.takeDamage(damage);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }
}

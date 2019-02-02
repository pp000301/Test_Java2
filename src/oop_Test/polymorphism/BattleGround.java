package oop_Test.polymorphism;

import oop_Test.inheritance.Enemy;
import oop_Test.inheritance.Hero;
import oop_Test.inheritance.Warrior;

public class BattleGround {

    public static void main(String[] args) {
        Zombie zombie = new Zombie(500);
        Alien alien = new Alien(300);
        Warrior warrior = new Warrior("123", 500);
        //System.out.println(zombie.getHealth());
        //System.out.println(warrior.isAlive());
        //System.out.println(zombie.isAlive());

        Enemy[] enemies = {new Alien(40), new Zombie(90)};
        attack(warrior, enemies);
    }

    static void attack(Hero hero, Enemy[] enemies) {
        int current = 0;
        while (enemies[current].isAlive()) {
            int i = enemies[current].getHealth();
            i -= hero.getDamage();
            if (i <= 0)
                current++;


        }
        System.out.println(current);
    }
}

package OOP_Test.inheritance;

import OOP_Test.polymorphism.Mortaleable;

public class TrainingGround {
    public static void main(String[] args) {

        //hero.getName("456");
        Enemy enemy = new Enemy(0);

        System.out.println(enemy.isAlive());

    }
}

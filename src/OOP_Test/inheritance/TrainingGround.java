package OOP_Test.inheritance;

public class TrainingGround {
    public static void main(String[] args) {
        Hero hero= new Warrior("1");
        Hero hero2= new Wizard("2");

        //hero.getName("456");
        Enemy enemy = new Enemy(100);
        hero.attackEnemy(enemy);
        hero2.attackEnemy(enemy);



    }
}

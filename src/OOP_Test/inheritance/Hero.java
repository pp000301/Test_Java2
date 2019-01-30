package OOP_Test.inheritance;

public abstract class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
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
}

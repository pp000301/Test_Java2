package OOP_Test.inheritance;

public class Enemy {
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




}

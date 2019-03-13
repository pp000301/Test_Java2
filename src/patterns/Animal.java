package patterns;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sit() {
        System.out.println(name+" "+"sit");
    }

    public void toLie() {
        System.out.println(name+" "+"toLie");
    }

    public void vote() {
        System.out.println(name+" "+"vote");
    }
}


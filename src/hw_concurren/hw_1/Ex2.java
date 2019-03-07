package hw_concurren.hw_1;

public class Ex2 {
    public static void main(String[] args) {

        Thread one = new Thread("One");
        Thread two = new Thread("Two");
        Thread three = new Thread("Three");

        one.setPriority(Thread.MAX_PRIORITY);
        two.setPriority(Thread.NORM_PRIORITY);
        three.setPriority(Thread.MIN_PRIORITY);

        one.start();
        two.start();
        three.start();

        System.out.println(one.getPriority() + " " + one.getName() + " " + one.getId());
        System.out.println(two.getPriority() + " " + two.getName() + " " + two.getId());
        System.out.println(three.getPriority() + " " + three.getName() + " " + three.getId());
    }

}

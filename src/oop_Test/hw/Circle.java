package oop_Test.hw;

public class Circle extends Point implements Figures {
    int radius;

    public Circle(double x, double y, int radius) {
        super(x, y);
        this.radius = radius;
    }

    public void getInformation() {
        System.out.println("Радиус равен " + radius + " Х " + x + " Y " + y);
    }


    @Override
    public double getSquare() {
        return 3.14 * Math.pow(radius, 2);
    }
}

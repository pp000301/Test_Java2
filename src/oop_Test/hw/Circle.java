package oop_Test.hw;

public class Circle extends Point implements Figures {
    int radius=getRadius();
    public Circle (double x, double y){
        super( x, y);
    }

    public void getInformation(){
        System.out.println("Радиус равен "+radius+" Х "+x+" Y "+y);
    }

    @Override
    public int getRadius() {
        return 30;
    }

    @Override
    public double getSquare() {
        return 3.14*Math.pow(getRadius(),2);
    }
}

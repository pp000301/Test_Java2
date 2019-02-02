package oop_Test.hw;

public class Rectangle extends Point implements Figures {
    int radius=getRadius();
    double alfa;// угол пересечения диагоналей прямоугольника
    public Rectangle(double x, double y,int alfa){
        super( x, y);
        this.alfa=alfa;
    }

    int diagonall(){
        return getRadius()*2;
    }

    @Override
    public int getRadius() {
        return 20;
    }

    @Override
    public double getSquare() {
        return Math.pow(getRadius(),2)*Math.sin(alfa*3.14/200);
    }

    public int getDiagonal(){
        return getRadius()*2;
    }



}

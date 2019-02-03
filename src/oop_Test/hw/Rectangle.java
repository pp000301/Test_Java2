package oop_Test.hw;

public class Rectangle extends Point implements Figures {
    int radius;// радиус описанной окружности вокруг четырехугольника
    double alfa;// угол пересечения диагоналей прямоугольника

    public Rectangle(double x, double y,int alfa, int radius){
        super( x, y);
        this.alfa=alfa;
        this.radius=radius;
    }

    int diagonall(){
        return radius*2;
    }



    @Override
    public double getSquare() {
        return Math.pow(radius,2)*Math.sin(alfa*3.14/200);
    }

    public int getDiagonal(){
        return radius*2;
    }



}

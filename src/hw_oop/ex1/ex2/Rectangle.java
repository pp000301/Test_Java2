package hw_oop.ex1.ex2;

import hw_oop.ex1.Point;

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


    public static class main {
        public static void main(String[] args) {
            Circle circle = new Circle(2, 3, 20);
            Rectangle rectangle = new Rectangle(5, 5, 25, 30);
            System.out.println("Площать прямоугольника равна" + rectangle.getSquare() + " Диагональ " + rectangle.diagonall());
            System.out.println("Площадь круга равна " + circle.getSquare());
        }
    }
}

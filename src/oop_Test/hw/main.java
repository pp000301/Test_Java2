package oop_Test.hw;

public class main {
    public static void main(String[] args) {
    Circle circle =new Circle(2,3);
    Rectangle rectangle =new Rectangle(5,5,25);
        System.out.println("Площать прямоугольника равна"+rectangle.getSquare()+" Диагональ "+rectangle.diagonall());
        System.out.println("Площадь круга равна "+circle.getSquare());
    }
}

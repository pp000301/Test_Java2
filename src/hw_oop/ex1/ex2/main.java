package hw_oop.ex1.ex2;



public class main {
    public static void main(String[] args) {

        Circle circle = new Circle(2,2,10);
        System.out.println(circle.getSquare());
        circle.getInformation();

        Rectangle rectangle = new Rectangle(2,2,4,5);
        System.out.println("Диагональ четырехугольника "+ rectangle.diagonall());
        System.out.println("Площадь четырехугольника "+rectangle.getSquare());
    }
}

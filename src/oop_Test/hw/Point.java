/*Создать класс Point, описывающий точку в двумерных координатах. Полями этого класса должны быть координаты x и y.
 Класс должен иметь один конструктор, принимающий координаты x и y. Сделайте информацию о координатах скрытой,
 а получить её можно только с помощью методов доступа (get/set). Создать метод distance, принимающий объект Point и
 определяющий расстояние до неё.
 Дополнительно) Сделайте этот класс неизменяемым. Предоставьте методы translate()   и scale().
 В частности, метод translate() должен перемещать точку на определенное расстояние в направлении координат х и у ,
 а метод scale() — изменять масштаб по обеим координатам на заданный коэффициент.
 Реализуйте эти методы таким образом, чтобы они возвращали новые точки в качестве результата*/


package oop_Test.hw;

public class Point {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void get() {
        System.out.println("x= " + x + " y= " + y);
    }

    public void distance() {
        System.out.println("Расстояние до точки равно: " + Math.sqrt((x * x) + (y * y)));
    }

    public Point translate(double x, double y) {
        Point point = new Point(this.x += x, this.y += y);
        return point;
    }

    public Point scale(double scale) {

        this.x *= scale;
        this.y *= scale;

        Point point = new Point(this.x, this.y);
        return point;
    }
}

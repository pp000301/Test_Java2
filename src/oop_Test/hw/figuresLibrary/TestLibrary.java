package oop_Test.hw.figuresLibrary;

public class TestLibrary  {
    public static void main(String[] args) {
        Foursquare foursquare = new Foursquare(3);

        Rectangle rectangle = new Rectangle(3, 5);
        Rectangle rectangle1 = new Rectangle(3, 5);
        Triangle triangle=new Triangle(3,3,3);
        Rhombus rhombus = new Rhombus(3, 25);
        Parallelogram parallelogram = new Parallelogram(3, 5);
        Rhombus rhombus1 = new Rhombus(5, 25);



        //System.out.println(area_comparison(rectangle, rectangle1));
        System.out.println(getTriangleComparison(triangle));
        System.out.println(getRectangleComparison(triangle));
        System.out.println(getRectangleComparison(rectangle1));

    }


    static boolean area_comparison(Object a, Object b) {
        double sq1 = 0;
        double sq2 = 0;
        sq1 = getSquare1(a);
        sq2 = getSquare2(b);

        if (sq1 == sq2)
            return true;
        else return false;

    }

    private static double getSquare1(Object a) {
        double square1=0;
        if (a instanceof Foursquare) {
            Foursquare a1 = (Foursquare) a;
            square1 = a1.square();
        } else if (a instanceof Rectangle) {
            Rectangle a1 = (Rectangle) a;
            square1 = a1.square();
        } else if (a instanceof Rhombus) {
            Rhombus a1 = (Rhombus) a;
            square1 = a1.square();
        } else if (a instanceof Parallelogram) {
            Parallelogram a1 = (Parallelogram) a;
            square1 = a1.square();
        } else if (a instanceof Trapezium) {
            Trapezium a1 = (Trapezium) a;
            square1 = a1.square();
        }
        return square1;
    }

    private static double getSquare2(Object b) {
        double square2=0;
        if (b instanceof Foursquare) {
            Foursquare b1 = (Foursquare) b;
            square2 = b1.square();
        } else if (b instanceof Rhombus) {
            Rhombus b1 = (Rhombus) b;
            square2 = b1.square();
        } else if (b instanceof Parallelogram) {
            Parallelogram b1 = (Parallelogram) b;
            square2 = b1.square();
        } else if (b instanceof Trapezium) {
            Trapezium b1 = (Trapezium) b;
            square2 = b1.square();
        }else if (b instanceof Rectangle){
            Rectangle b1 = (Rectangle) b;
            square2 = b1.square();
        }
        return square2;
    }

    static boolean getTriangleComparison(Object a){
        if (a instanceof Triangle)
            return true;
        return false;

    }

    static boolean getRectangleComparison(Object a){
        if (a instanceof Rectangle)
            return true;
        return false;

    }
}

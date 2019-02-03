package oop_Test.hw.figuresLibrary;

public class TestLibrary {
    public static void main (String[] args) {
        Foursquare foursquare = new Foursquare(3);
        System.out.println(foursquare.square());
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println(rectangle.square());
        Rhombus rhombus = new Rhombus(3, 25);
        System.out.println(rhombus.square());
        Parallelogram parallelogram = new Parallelogram(3, 5);
        System.out.println(parallelogram.square());
        Rhombus rhombus1 = new Rhombus(5, 25);
        System.out.println(rhombus.getClass());
        System.out.println(rhombus1.getClass());
        System.out.println(rhombus.getClass().equals(rectangle.getClass()));
        area_comparison(rectangle,foursquare);

    }





    static boolean  area_comparison (Object a, Object b) {
        System.out.println(a.getClass());
        System.out.println(b.getClass());
        if (a == b)
            return true;
        else {
            return false;

        }}

}

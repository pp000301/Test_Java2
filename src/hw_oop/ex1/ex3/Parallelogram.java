package hw_oop.ex1.ex3;

public class Parallelogram extends Foursquare {
    int h; // Высота параллелограма
    Parallelogram(int a, int h){
        super(a);
        this.h=h;
    }

    @Override
    public double square() {
        return a*h;
    }
}

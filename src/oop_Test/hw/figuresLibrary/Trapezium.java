package oop_Test.hw.figuresLibrary;

public class Trapezium extends Parallelogram {
    int b;
    Trapezium (int a,int b, int h){
        super(a,h);
        this.b=b;
    }

    @Override
    public double square() {
        return 0.5*a*b*h;
    }
}

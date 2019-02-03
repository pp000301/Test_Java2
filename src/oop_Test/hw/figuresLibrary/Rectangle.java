package oop_Test.hw.figuresLibrary;

public class Rectangle extends Foursquare{
    int b;
    Rectangle(int a,int  b){
        super(a);
        this.b=b;
    }

    @Override
    public double square() {
        return a*b;
    }
}

package oop_Test.hw.figuresLibrary;

public class Rhombus extends Foursquare {
    double alfa;
    Rhombus(int a, double alfa){
        super(a);
        this.alfa=alfa;
    }

    @Override
    public double square() {
        return a*a*Math.sin(alfa*0.0174533);
    }
}

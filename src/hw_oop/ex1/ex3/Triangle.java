package hw_oop.ex1.ex3;

public class Triangle extends Foursquare {
    int b;
    int c;
    Triangle(int a,int b,int c){
        super(a);
        this.b=b;
        this.c=c;
    }

    @Override
    public double square() {
        int p=a+b+c;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}

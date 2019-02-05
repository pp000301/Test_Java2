package generics.hw;


public class Pair1<E extends Comparable> {
    E i;
    E k;

    public Pair1(E i, E k) {
        this.i = i;
        this.k = k;
    }

    public E getI() {
        return i;
    }

    public E getK() {
        return k;
    }

    public E getMax() {

        if (i.compareTo(k) > 0) {

            return i;
        } else
            return k;
    }

    public E getMin() {

        if (i.compareTo(k) < 0) {

            return i;
        } else
            return k;
    }

}

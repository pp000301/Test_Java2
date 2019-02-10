/*
Видоизмените класс из предыдущего упражнения, введя методы mах() и min() для получения наибольшего и
наименьшего из двух элементов. Наложите соответствующее ограничение на обобщенный тип Е
* */

package generics.hw.iterator;

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

    @Override
    public String toString() {
        return "Pair1{" +
                "i=" + i +
                ", k=" + k +
                '}';
    }

}

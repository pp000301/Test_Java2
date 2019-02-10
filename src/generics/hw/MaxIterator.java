/*Написать Iterable<Pair<Integer>> принимающий List<Pair<Integer>> который возвращает итератор max чисел из Pair из
 предыдущего задания (т.е. Iterator<Integer>) от этих Pair<Integer>.
*/

package generics.hw;
import java.util.Iterator;
import java.util.List;

public class MaxIterator implements Iterator {
    List<Pair1> pair;
    private int index = 0;

    public MaxIterator(List<Pair1> pair) {
        this.pair = pair;
    }

    @Override
    public boolean hasNext() {
        return index < pair.size();
    }

    @Override
    public Object next() {
        return pair.get(index++).getMax();
    }
}

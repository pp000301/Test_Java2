package collektions;

import java.util.*;

/**
 * Created by pp000 on 08.02.2019.
 */
public class AAA {
    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(6, 3, 6, 3, 4, 5, 1, 7, 7, 7, 8, 8);
        ArrayList<Integer> arrayList = new ArrayList<>(ints);
        // System.out.println(ints);
        // sortRandomAccessCollections(ints);
        System.out.println(arrayList);


        countUnique(arrayList);

    }

    //Сортировка рандомной коллеекции
    private static <E extends Comparable<E>, T extends List<E> & RandomAccess> void sortRandomAccessCollections(T collection) {
        Collections.sort(collection);
    }

    //Считает кол уникальных элементов
    private static void countUnique(ArrayList list) {
        sortRandomAccessCollections(list);

        int count = 0;

        for (int i = 0; i < list.size() - 1; i++) {

            boolean count1 = true;
            int count2 = i + 1;
            int count3 = 1;
            while (count1) {
                if (count2 < list.size() && list.get(i).equals(list.get(count2))) {
                    count2++;
                    count3++;
                } else {
                    count1 = false;
                    count++;
                }
            }
            i += count3 - 1;
        }
        if (list.get(list.size() - 1) != list.get(list.size() - 2))
            count++;
        System.out.println(count);
    }
}

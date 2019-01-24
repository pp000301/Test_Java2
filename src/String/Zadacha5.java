/*Заданы два массива строк. Написать функцию, определяющую, является ли содержимое этих массивов идентичным.
Порядок расположения элементов значения не имеет.*/

package String;

import java.util.*;

import static java.lang.System.out;

public class Zadacha5 {

    public static void main(String[] args) {

        String[] a = {"1", "2"};
        String[] b = {"2", "3"};

        Arrays.sort(a);
        Arrays.sort(b);

        boolean resuil = Arrays.deepEquals(a, b);
        out.println(resuil);


    }
}

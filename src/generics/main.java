package generics;

import generics.hw.MaxIterator;
import generics.hw.Pair1;
import generics.hw.TreeMap;

import java.util.*;

public class main {
    public static void main(String[] args) {

        Pair1<Integer> pair1 = new Pair1<>(3, 6);
        Pair1<Integer> pair2 = new Pair1<>(3, 7);
        Pair1<Integer> pair3 = new Pair1<>(3, 9);

        List<Pair1> pair1List = new ArrayList<>();

        pair1List.add(pair1);
        pair1List.add(pair2);
        pair1List.add(pair3);

//Использование собственного итератора

        MaxIterator iterator = new MaxIterator(pair1List);

        while (iterator.hasNext()) {
            Object i = iterator.next();
            System.out.println(i);
        }
// Тест на задачу про частоту встречаемости слов

        TreeMap treeMap = new TreeMap("gdgdg shdgshdgh shdghsd h s d hhs d d");
        treeMap.map(treeMap.text);
    }
}

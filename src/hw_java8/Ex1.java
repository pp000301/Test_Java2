package hw_java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;


public class Ex1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("qwqwqwwqqwqw");
        list.add("qwqwqwwqasasas");
        list.add("qwqwqwwqxccdcdcd");

        Optional<String> max = list.stream()
                .max(Comparator.naturalOrder());
        System.out.println(max);

    }
}

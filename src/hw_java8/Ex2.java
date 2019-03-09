package hw_java8;


import java.util.*;
import java.util.stream.Collectors;


public class Ex2 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        Collections.addAll(names, "John", "Paul", "George", "John", "Paul", "John");
        Map<String, Long> counts =
        names.stream().collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(counts);

    }



}

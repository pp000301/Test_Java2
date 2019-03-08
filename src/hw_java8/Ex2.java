package hw_java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        Collections.addAll(names, "John", "Paul", "George", "John", "Paul", "John")
        names.stream().
                distinct().
                map(p-> p+"-"+cont((Stream<String>) names,p)
                ).
                forEach(System.out::println);

    }

    static int cont(Stream<String> stream, String s ){
        int i=0;
        stream.filter(p->p.equals(s)).peek(i++);

        return i;
    }

}

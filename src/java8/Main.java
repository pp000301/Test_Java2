package java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        // ex1---------------------------------------------
        Predicate<Integer> integerPredicate = test -> test > 0;
        integerPredicate.test(3);
        MyPredicate<Integer> myPredicate = (arg, arg2, arg3) -> arg + arg2 + arg3 > 0;
        System.out.println(myPredicate.test(1, 2, 3));
// ex2---------------------------------------------
        System.out.println(addUp(Stream.of(1, 2, 3, 4)));
// ex2---------------------------------------------

        List<Singer> singers=new ArrayList<>();
        singers.add(new Singer("a","s"));
        singers.add(new Singer("aa","ss"));
        singers.add(new Singer("aaa","sss"));
        singers.add(new Singer("aaaa","ssss"));
        singers.add(new Singer("aaaaa","sssss"));

        Up(singers.stream(),"a");

        Optional<String> max = Stream.of("John Lennon", "Paul McCartney",
                "George Harrison", "Ringo Starr", "Pete Best", "Stuart Sutcliffe")
                .max(Comparator.naturalOrder());
        System.out.println(max);


    }


    // ex2---------------------------------------------
    static int addUp(Stream<Integer> numbers) {
        return numbers.reduce(0, (i, k) -> i + k);
    }
// ex3---------------------------------------------

    static void Up(Stream<Singer> singers, String nam) {
                singers.
                filter(name-> name.name.equals(nam)).
                forEach(p-> System.out.println(p.homeTown));
    }


}


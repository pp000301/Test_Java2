package hw_java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Ex1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        //list.add("");
        list.add("qwqwqwwqqwqw");
        list.add("qwqwqwwqasasas");
        list.add("qwqwqwwqxccdcdcd");

        int maxLeng=0;
        for (String p : list ) {
            if (maxLeng<p.length())
                maxLeng=p.length();

        }int finalMaxLeng = maxLeng;



                list.stream().
                        filter(p->p.length()==finalMaxLeng).
                        forEach(p->
                            System.out.println(p)


                         );

    }
}

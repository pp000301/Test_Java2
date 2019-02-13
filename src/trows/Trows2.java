package trows;

import java.util.ArrayList;
import java.util.List;

public class Trows2 {
    public static void main(String[] args) throws Trows4 {
//        List<String> test = new ArrayList<>();
//        test.add("one");
//        try {
//            System.out.println(test.get(2));
//        } catch (IndexOutOfBoundsException e) {
//            System.out.println("Ошибка индекса");
//        }

        //h1();
        h3();
    }

    static void h1() throws Trows4 {
        h2();
    }

    static void h2() throws Trows4 {
        throw new Trows4();
    }

    static void h3()  {
        throw new NullPointerException();
    }
}

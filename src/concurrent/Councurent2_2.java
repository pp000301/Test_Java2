package concurrent;

import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Councurent2_2 {
    private static final Object monitor = new Object();
    private static final List<String> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        input();

        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {e.printStackTrace();}

                synchronized (monitor) {
                    Collections.sort(list);
                }
            }
        }).start();

        //out.println(list);
    }

    private static void input() throws InterruptedException {

        while (true) {
            Scanner sr = new Scanner(System.in);

            String n = sr.nextLine();
            if(n.equals("")){
                out.println(list);
            }
            else {
                //synchronized (monitor) {

                    list.add(n);

                    //int leng = n.length();

                    //if (leng < 80)
                    // list.add(n);
                    //else {
                    //  list.add(n.substring(0, 80));
                    //  list.add(n.substring(80, leng));
                    // }

                    // if (n.equals("exit")) {
                    //  k = false;
                    //  sr.close();
                    // }
                //}
            }

        }
    }




}

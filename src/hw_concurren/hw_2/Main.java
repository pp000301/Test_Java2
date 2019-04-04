package hw_concurren.hw_2;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    private static final Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {

        List<Integer> integerList = new ArrayList<>();


        new Thread(() -> {
            while (true) {
                produce(integerList);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(integerList);
            }
        }).start();

        new Thread(() -> {
            while (true) {
                try {
                    consume(integerList);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();


    }

    private static void consume(List<Integer> integerList) throws InterruptedException {

        if (integerList.size() > 0) {
            Random rnd = new Random();
            int i = rnd.nextInt(integerList.size());
            synchronized (monitor) {
                integerList.remove(i);
            }
        }
    }

    private static void produce(List<Integer> integerList) {
        Random rnd = new Random();
        int i = rnd.nextInt(100);

        if (integerList.size() < 10)
            synchronized (monitor) {
                integerList.add(i);
            }
    }


}

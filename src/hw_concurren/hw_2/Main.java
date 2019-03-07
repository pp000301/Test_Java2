package hw_concurren.hw_2;


import java.util.LinkedList;
import java.util.Random;

public class Main {

    private static final Object monitor = new Object();

    public static void main(String[] args) {

        //List<Integer> list =new LinkedList<>();//lfjrjakjfkfjdkffjdksjff
        //List<Integer> list =new LinkedList<>();//lfjrjakjfkfjdkffjdksjff
        //List<Integer> list =new LinkedList<>();//lfjrjakjfkfjdkffjdksjff
        //List<Integer> list =new LinkedList<>();//lfjrjakjfkfjdkffjdksjff
        //List<Integer> list =new LinkedList<>();//lfjrjakjfkfjdkffjdksjff
        //List<Integer> list =new LinkedList<>();//lfjrjakjfkfjdkffjdksjff


        new Thread(()->{

        }).start();

        new Thread(()->{

        }).start();

    }

    public static void produce(LinkedList<Integer> list){
        Random rnd = new Random();
        int i= rnd.nextInt(20);
        for (int j = 0; j < i; j++) {

        }

    }
}

package concurrent;
import java.util.Random;
public class Concurent3 {

    public static void main(String[] args) {

//        new Thread(new MyRaneble("aaa"));
//
//        Thread a =new Thread(()->{
//            printString("aaa1","bbb1","ccc1");
//        });
//        Thread b =new Thread(()->{
//            printString("aaa2","bbb2","ccc2");
//        });
//        Thread c =new Thread(()->{
//            printString("aaa3","bbb3","ccc3");
//        });
//        Thread d =new Thread(()->{
//            printString("aaa4","bbb4","ccc4");
//        });
//
//        a.start();
//
//        b.start();
//
//        c.start();
//
//        d.start();
//    }

    public static synchronized void printString(String a,String b, String c) {

        Random rnd = new Random(System.currentTimeMillis());

        for (int i = 0; i <5 ; i++) {
            int number =  +rnd.nextInt(3);
            if (number==0)
                System.out.print(a+' ');
            else if(number==1)
                System.out.print(b+' ');
            else if(number==2)
                System.out.print(c+' ');
        }
        System.out.println();
    }


}

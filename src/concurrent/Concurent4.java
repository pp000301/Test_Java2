package concurrent;


public class Concurent4 {
    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            while (true) System.out.println("shdghasgdhasghd");
        });

        thread.start();
        for (int i = 0; i < 10000; i++) {

        }
        thread.interrupt();


    }

}

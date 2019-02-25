package concurrent;


public class Concurrent1 {

    private static final Object monitor = new Object();

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            synchronized (monitor) {
                for (int i = 0; i < 5; i++) {
                    print1("hello1");
                    try {
                        monitor.notify();
                        monitor.wait();
                        monitor.notify();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread.start();

        synchronized (monitor) {

            for (int i = 0; i < 5; i++) {
                print1("Hello");
                monitor.notify();
                monitor.wait();
                monitor.notify();
            }
        }

    }

    public static void print1(String s) {

        System.out.println(s);

    }


}

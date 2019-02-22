package concurrent;


public class Concurrent1 {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = getThread();

        thread.start();

        thread.join();

        getMain();

    }

    private static void getMain() {
        for (int i = 0; i < 10; i++) {
            System.out.println("main" + i);
        }
    }

    private static Thread getThread() {
        return new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("thread" + i);
            }
        });
    }
}

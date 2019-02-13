package trows;

public class Trows1 {
    public static void main(String[] args) {
        String i = null;
        go(i);
    }

    public static void go(String i) {
        try {
            i.length();
        } catch (NullPointerException e) {
            System.out.println("Ошибка");
        }
    }

}

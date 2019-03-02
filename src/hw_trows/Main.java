package hw_trows;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        sumOfValues();

    }

    private static void sumOfValues() {
        System.out.println("Сумма введенных знвчений " + readValues());
    }

    private static double readValues() {
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            Scanner sr = new Scanner(System.in);
            try {
                double n = sr.nextDouble();
                sum += n;
            } catch (InputMismatchException e) {
                e.printStackTrace();
            }

        }
        return sum;
    }

}

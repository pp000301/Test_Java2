package tsicli_recursia;

import java.util.Scanner;
import static java.lang.System.out;

public class Zadacha2_Rekursia {

    static int factorial(int n) {
        int result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * factorial(n-1);
        return result;
    }

    public static void main(String[] args) {

        Scanner sr =new Scanner(System.in);
        out.print("ВВедите Число: ");
        int f= sr.nextInt();

    out.println("Факториал равен "+factorial(f));
    }
}

/*Написать программу высчитывающую факториал введённого целого числа.
   Нужно 2 варианта:
с циклом
с рекурсией.*/
package Tsicli_Recursia;

import java.util.Scanner;
import static java.lang.System.out;

public class Zadacha2 {
    public static void main(String[] args) {

        Scanner sr =new Scanner(System.in);
        out.print("ВВедите Число: ");
        int f= sr.nextInt();

    int factorial=1;
        for (int i = 1; i <=f ; i++) {
            factorial*=i;
        }
    out.println("Факторивл равен "+factorial);
    }
}

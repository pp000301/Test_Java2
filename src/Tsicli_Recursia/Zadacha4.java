/* Написать программу, определяющую, является ли введённое целое число простым, т.е. делится без остатка только
 на 1 и само на себя.*/

package Tsicli_Recursia;

import java.util.Scanner;
import static java.lang.System.out;

public class Zadacha4 {
    public static void main(String[] args) {

        Scanner sr =new Scanner(System.in);
        out.print("ВВедите Число: ");
        int f= sr.nextInt();

        Boolean q=true;
        for (int i = 2; i <f ; i++) {
            if ((f&i)==0)
                q=false;
        }

        if (q)
            out.println("Число простое");
        else
            out.println("Число не явдяется простым");
    }
}

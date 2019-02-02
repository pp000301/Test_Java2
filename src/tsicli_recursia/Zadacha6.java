/*Имеется число. Посчитать сумму цифр данного числа.*/
package tsicli_recursia;

import java.util.Scanner;
import static java.lang.System.out;

public class Zadacha6 {
    public static void main(String[] args) {

        Scanner sr =new Scanner(System.in);
        out.print("ВВедите число ");
        String n= sr.nextLine();
        int lng=n.length();
        int sum=0;

        for (int i = 0; i < lng; i++) {
            sum+=Character.getNumericValue(n.charAt(i));

        }

        out.println("Сумма цифр числа равна "+sum);
    }
}

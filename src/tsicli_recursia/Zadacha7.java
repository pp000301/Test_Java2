/*Имеется целое число. Вывести его в бухгалтерском формате.      Т.е., начиная справа, каждые
три позиции отделяются пробелом.     Например 20023143 должно быть выведено как 20 023 143*/

package tsicli_recursia;

import java.util.Scanner;
import static java.lang.System.out;

public class Zadacha7 {

    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        out.print("ВВедите число ");
        String n= sr.nextLine();
        int lng=n.length();
        int shagOne=lng%3;
        int[] a=new int[100];

        for (int i = 0; i < lng; i++) {
            a[i]=Character.getNumericValue(n.charAt(i));
            out.print(a[i]);
        }

        out.println();

        for (int i = 0; i < shagOne ; i++) {
           out.print(a[i]);
        }
            out.print(" ");

        for (int i = shagOne; i < lng; i+=3) {

            out.print(a[i]);
            out.print(a[i+1]);
            out.print(a[i+2]);
            out.print(" ");

        }

    }
}

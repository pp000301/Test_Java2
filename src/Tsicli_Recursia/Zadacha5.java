/*Имеется последовательность случайных чисел. Найти и вывести наибольшее из них.*/

package Tsicli_Recursia;

import java.util.Scanner;
import static java.lang.System.out;

public class Zadacha5 {
    public static void main(String[] args) {

        Scanner sr =new Scanner(System.in);
        out.print("ВВедите количество чисел последовательности: ");

        int n= sr.nextInt();
        int[] a=new int[10];

        for (int i = 0; i <=n-1 ; i++) {
            out.print("ВВедите "+(i+1)+" чисело последовательности: ");
            int k= sr.nextInt();
            a[i]=k;
        }

        int max=a[0];

        for (int i = 0; i <n ; i++) {
            if (a[i]>max)
                max=a[i];
        }

        out.print("Максимальное число равно "+max);
    }
}

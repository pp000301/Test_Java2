package String;
/*Заданы два массива строк. Написать функцию, определяющую, является ли содержимое этих массивов идентичным.
Порядок расположения элементов значения не имеет. */

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.out;

public class Zadacha_Vopros {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        out.println("ВВедите количество элементов первого массива  ");
        int n = sr.nextInt();
        out.println(n);
        String[] a = new String[4];

        // бЛОК ВВОДА4
        out.print("ВВедите элементы первого массива ");

        for (int i = 0; i <= n; i++) {
            a[i] = sr.nextLine();
        }



        a[0]="8";

        out.println(a[0]);
        out.println(a[1]);
        out.println(a[2]);


        for (int i = 0; i <= n; i++) {
            out.println(a[i]);
        }

        //out.println("ВВедите количество элементов Второго массива  ");
        //int l = sr.nextInt();
        //String[] b = new String[3];

        // бЛОК ВВОДА
        //out.println("ВВедите элементы второго массива ");
        //for (int i = 0; i < l; i++) {
            //b[i] = sr.nextLine();
        //}

        //Arrays.sort(a);
        //Arrays.sort(b);

       // for (int i = 0; i < n; i++) {
            //out.println(a[i]);
        //}


    }
}

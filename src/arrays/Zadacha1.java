/*Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном.*/


package arrays;

import java.util.Scanner;


import static java.lang.System.out;

public class Zadacha1 {




    //hasdgfgsafdgsfahdgfasgdfghasd

    //hasdgfgsafdgsfahdgfasgdfghasd
    //hasdgfgsafdgsfahdgfasgdfghasd

    public static void main(String[] args) {
        Scanner sr =new Scanner(System.in);
        out.println("ВВедите количество элементов массива ");
        int n= sr.nextInt();
        int[] a=new int[100];

        // бЛОК ВВОДА
        out.println("ВВедите элементы массива ");
        for (int i = 0; i <n ; i++) {
               a[i]=sr.nextInt();
        }

        //Вывод в простом порядке
        sequence(n, a);



        // Вывод в обратном порядке()

        invert(n, a);
    }
// Методы
    private static void invert(int n, int[] a) {
        out.println(" элементы массива в обратном порядке ");

        for (int k = n-1; k >=0 ; k--) {
           out.println(a[k]);
        }
    }


    private static void sequence(int n, int[] a) {
        out.println(" элементы массива в обычном порядке ");
        for (int i = 0; i <n ; i++) {
            out.println(a[i]);
        }
    }
}

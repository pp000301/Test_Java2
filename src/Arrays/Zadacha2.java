/*Напишите программу, заносящую в массив первые 100 натуральных чисел, делящихся на 13 или на 17, и печатающую его.*/
package Arrays;

import java.util.Scanner;

import static java.lang.System.out;


public class Zadacha2 {


    private static void sequence(int[] a) {

        out.println(" элементы массива в обычном порядке ");
        for (int i = 0; i < 100; i++) {
            out.println(a[i]);
        }
    }

    public static boolean Del1(int a) {

        Boolean result=false;
        if ((a%13==0)|(a%17==0))
            result =true;
        return result;
    }


    public static void main(String[] args) {
        int[] a=new int[100];
        int k=0,l=1;

        while (k<100){
            if (Del1(l)) {
                a[k]=l;
                k++;
            }
            l++;
        }

        sequence(a);


    }

}

/*Написать функцию, разбивающую строку на равные части по n символов и сохраняющую отдельные части в массив.
 Вывести этот массив.*/
package string;

import java.util.*;


public class Zasacha7 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("ВВедите строку ");
        String str1 = sr.nextLine();
        System.out.println("ВВедите введите число разбиения ");
        int n1 = sr.nextInt();
        razbienie(str1, n1);

    }

    public static void razbienie(String str, int n) {
        String[] a = new String[100];
        int k = 0;
        for (int i = 0; i < str.length(); i += n) {
            if (i + n <= str.length()) {
                a[k] = (str.substring(i, i + n));
                k++;
            } else {
                a[k] = (str.substring(i, str.length()));
                k++;
            }

        }
        for (int j = 0; j < k; j++) {
            System.out.println(a[j]);
        }

    }
}

/* Написать функцию, заменяющую несколько последовательных одинаковых символов в строке одним.
 Пример: aaabbcdeef -> abcdef*/
package string;

import java.util.*;
import java.lang.*;

public class Zadacha9 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("ВВедите строку ");
        String str1 = sr.nextLine();
        char[] a = new char[300];
        a = zapis(str1);
        System.out.print(rez(a, str1.length()));

    }

    //Метод разбивает строку в массив char-ов
    public static char[] zapis(String b) {
        int k = 0;
        char[] c = new char[300];
        for (int i = 0; i < b.length(); i++) {
            c[k] = b.charAt(i);
            k++;
        }
        return c;
    }

    //Метод убирает дублиремые символы, принимает 2 параметра: масив char b и кол символов в нем.
    public static StringBuffer rez(char[] v, int z) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < z; i++) {
            int k = i;
            boolean schet = true;
            while (schet & k < z) {
                if (v[k] == v[k + 1])
                    k++;
                else {
                    schet = false;
                    i = k;
                }
            }
            result.append(v[i]);
        }
        return result;
    }
}


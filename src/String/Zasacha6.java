/*Подсчитать количество всех точек, запятых и восклицательных знаков в строке.*/

package String;

import java.util.Scanner;

import static java.lang.System.out;

public class Zasacha6 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        out.println("ВВедите строку ");
        String n = sr.nextLine();
        Schet(n);

    }

    public static void Schet(String f) {
        int k, l, m;
        k = 0;
        l = 0;
        m = 0;

        out.println(f.charAt(f.length() - 1));
        for (int i = 0; i <= f.length() - 1; i++) {
            if (f.charAt(i) == '.')
                k++;
            else if (f.charAt(i) == '!')
                l++;
            else if (f.charAt(i) == ',')
                m++;
        }
        out.println("Точек: " + k + " Запятых: " + m + " Восклицательных знаков: " + l);

    }
}

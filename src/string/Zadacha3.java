package string;
/* Написать функцию, принимающую 2 параметра: строку и слово - и возвращающую true, если строка начинается и
 заканчивается этим словом.*/

import java.util.Scanner;

import static java.lang.System.out;

public class Zadacha3 {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        out.println("Ведите строку ");
        String stroka = sr.nextLine();
        out.println("Ведите слово ");
        String slovo = sr.nextLine();

        int s = slovo.length();
        Boolean i, k = false;

        i = stroka.startsWith(slovo);
        k = stroka.startsWith(slovo, (stroka.length() - slovo.length()));

        vivod(i, k);

    }


    public static void vivod(Boolean i, Boolean k) {
        if (i & k)
            out.println("True");
        else out.println("False");
    }

}

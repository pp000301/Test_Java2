
/* Написать функцию, которая определяет, является ли последняя цифра переданного целого числа – цифрой 3 */
package if_swich;

import java.util.Scanner;
import static  java.lang.System.out;

public class Zadacha8 {
    static Boolean three (int a) {
        Boolean result=false;
        int b= a%10;
        if (b==3)
            result=true;
        return result;

    }

    public static void main(String[] args) {
        // ВВод данных с консоли

        Scanner sr = new Scanner(System.in);
        out.print("ВВедите  число: ");
        int i = sr.nextInt();


// Вызов функции

        Boolean result=three(i);
        out.print(result);
    }
}

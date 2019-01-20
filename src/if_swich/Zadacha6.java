       /*Написать функцию, которая принимает 2 целочисленных параметра, и возвращает наибольший из них.*/

package if_swich;
import java.util.Scanner;
import static  java.lang.System.out;



public class Zadacha6 {

    static int MAX(int a, int b) {
        int result=0;

        if (a>b)
            result=a;
        else if (b>a)
            result=b;

        return result;

    }

    public static void main(String[] args) {

// ВВод данных с консоли

        Scanner sr = new Scanner(System.in);
        out.print("ВВедите Первое число: ");
        int i = sr.nextInt();
        out.print("ВВедите Второе число: ");
        int k = sr.nextInt();

// Вызов функции

        int result=MAX(i,k);
        out.print("Наибольшее чило "+result);



    }
}

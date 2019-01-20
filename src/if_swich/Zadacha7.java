/*Написать функцию, которая принимает один целочисленный параметр и возвращает значение, равное этому
 параметру, возведенному в куб.*/


package if_swich;

import java.util.Scanner;
import static  java.lang.System.out;

public class Zadacha7 {

    static int Cub(int a) {
        int result=a*a*a;
        return result;

    }

    public static void main(String[] args) {

// ВВод данных с консоли

        Scanner sr = new Scanner(System.in);
        out.print("ВВедите Первое число: ");
        int i = sr.nextInt();


// Вызов функции

        int result=Cub(i);
        out.print("Результат: "+result);

    }
}

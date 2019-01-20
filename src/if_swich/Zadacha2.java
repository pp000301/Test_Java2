package if_swich;
 /*Имеется целое число, вводимое пользователем с консоли. Это число - сумма денег в рублях.
        Вывести это число, добавив к нему слово "рубль" в правильном падеже ("рубль", "рублей", "рубля")
        (if-else && switch)*/


import java.util.Scanner;
import static  java.lang.System.out;

public class Zadacha2 {


    public static void main(String[] args) {

        Scanner sr =new Scanner(System.in);
        System.out.print("ВВедите Число: ");
        int s= sr.nextInt();
        int result=s%10;

        switch (result){
            case 0 :
                out.println(s+" рублей");
                break;
            case 1 :
                out.println(s+" рубль");
                break;
            case 2 :
                out.println(s+" рубля");
                break;
            case 3 :
                out.println(s+" рубля");
                break;
            case 4 :
                out.println(s+" рубля");
                break;
            case 5 :
                out.println(s+" рублей");
                break;
            case 6 :
                out.println(s+" рублей");
                break;
            case 7 :
                out.println(s+" рублей");
                break;
            case 8 :
                out.println(s+" рублей");
                break;
            case 9 :
                out.println(s+" рублей");
                break;
        }
    }
}

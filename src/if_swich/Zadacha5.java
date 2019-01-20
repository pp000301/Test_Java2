/*Написать программу, которая считывает число, месяц и год, введённые пользователем в виде трёх целых чисел.
Программа должна определять, является ли введённая дата реальной и выводить результат.
Использовать следующую информацию:       Январь, март, май, июль, август, октябрь, декабрь - 31 день
Апрель, июнь, сентябрь, ноябрь - 30 дней       Февраль - 28 дней в обычный год, 29 дней в високосный */

package if_swich;

import java.util.Scanner;
import static  java.lang.System.out;

public class Zadacha5 {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        out.print("ВВедите День : ");
        int Day = sr.nextInt();
        out.print("ВВедите Месяц : ");
        int Month = sr.nextInt();
        out.print("ВВедите Год : ");
        Double Yers = sr.nextDouble();

        //--------------------------
        Boolean ResultYer = false;
        Boolean result = true;
        boolean div400 = Yers % 400 == 0;
        int maxDay=0;
        //--------------------------


        if (Yers % 4 == 0 & div400) {
            ResultYer = true;
            //out.println(ResultYer);
        } else if (Yers % 100 == 0 & Yers % 400 == 0) {
            ResultYer = true;
            //out.println(ResultYer);
        } else
            //out.println(ResultYer);
            if (Month == 1 | Month == 3 | Month == 5 | Month == 7 | Month == 9 | Month == 12)
                maxDay = 31;
            else if (Month == 4 | Month == 6 | Month == 10 | Month == 11) {
                maxDay = 30;
            } else if (Month == 2 & ResultYer)
                maxDay = 29;
            else if (Month == 2 & !ResultYer)
                maxDay = 28;

        //------------------------


        if (Month <= 12 & Day <= maxDay)
            out.println("Дата реальна");
        else
            out.println("Дата не реальна");

    }
}

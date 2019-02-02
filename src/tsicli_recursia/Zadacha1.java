/* В 1626 году индейцы продали Манхэттен за 24$.     Написать программу, которая высчитывает сумму,
 получившуюся бы в текущем году, если бы индейцы положили эти деньги в банк под 5% годовых.*/

package tsicli_recursia;

import java.util.Scanner;
import static java.lang.System.out;

public class Zadacha1 {



    public static void main(String[] args) {

        Scanner sr =new Scanner(System.in);
        out.print("ВВедите Текущий год: ");
        int s= sr.nextInt();
            double sm =24;

        for (int i = 1626; i <=s ; i++) {
            sm=sm+sm*0.05;
        }
        out.println("Итоговая сумма равна "+sm);
    }
}

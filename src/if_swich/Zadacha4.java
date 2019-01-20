/*Запросить у пользователя 2 слова. Если они одинаковы - вывести "Отлично! Слова одинаковы".
  Если они отличаются лишь регистром - "Хорошо. Почти одинаковы"
     Если они отличаются, но одной длины - "Ну, хотя бы они одной длины"*/

package if_swich;

import java.util.Scanner;
import static  java.lang.System.out;

public class Zadacha4 {
    public static void main(String[] args) {
        // ВВод данных с консоли

        Scanner sr =new Scanner(System.in);
        out.print("ВВедите Первое слово: ");
        String slovo1= sr.nextLine();
        out.print("ВВедите Второе слово: ");
        String slovo2= sr.nextLine();
// Вычисление длинны слов
        int long1=slovo1.length();
        int long2=slovo2.length();

// Работа с условиями

        Boolean resultOne=slovo1.equals(slovo2);
        Boolean resultTwo=slovo1.equalsIgnoreCase(slovo2);

        if (resultTwo & !resultOne)
            out.println("Слова почти одинаковы");
        else if (resultOne)
            out.println("Слова одинаковы");
        else if(long1==long2 & !resultOne)
            out.println("Ну, хотя бы они одной длины");
        else
            out.println("Слова не одинаковы");
    }
}

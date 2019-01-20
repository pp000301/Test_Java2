/*Написать функцию, которая принимает букву русского алфавита и целое число.
         На выходе функции должен быть символ, который смещен вправо на переданное число от переданной буквы..*/


package if_swich;

import java.util.Scanner;
import static  java.lang.System.out;

public class Zadacha9 {

    static String letter (String a, int b) {
        String resulte;
        int index=0;
        String araay []={"а","б","в","г","д","ж","з","е","ё","и","й","к","л","м","н","о","п","р","с","т","у","ф",
                "х","ц","ч","ш","щ","ъ","ы","ь","э","ю","я"};

        for (int i = 0; i <araay.length-1 ; i++) {
            if (araay[i].equals(a)) {
                index=i;
                break;
            }
        }

        index+=b-1;

        if (index>33)
            index-=34;
        resulte=araay[index];
        return resulte;

    }

    public static void main(String[] args) {

        // ВВод данных с консоли

        Scanner sr = new Scanner(System.in);
        out.print("ВВедите букву в нижнем регистре: ");
        String i = sr.nextLine();
        out.print("ВВедите число сдвига: ");
        int k = sr.nextInt();

// Вызов функции

        String result=letter(i,k);
        out.print(result);

    }
}

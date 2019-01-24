/* Подсчитать количество слов в тексте. Учесть, что слова могут разделяться несколькими пробелами.*/
package String;

import java.util.Scanner;

public class Zadacha8 {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("ВВедите строку ");
        String str1 = sr.nextLine();
        StringBuffer result = new StringBuffer();
        char[] a = new char[300];
        a=zapis(str1);
        result=rez(a,str1.length());
        vivod(result);



    }
    //Метод убирает дублируемые пробелы если они есть, принимает 2 параметра: масив char b и кол символов в нем.
    public static StringBuffer rez(char[] v, int z) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < z; i++) {
            int k = i;
            boolean schet = true;
            while (schet & k < z) {
                if (v[k] ==' ' & v[k + 1]==' ')
                    k++;
                else {
                    schet = false;
                    i = k;
                }
            }
            result.append(v[i]);
        }
        return result;
    }
    //Метод разбивает строку в массив char-ов
    public static char[] zapis(String b) {
        int k = 0;
        char[] c = new char[300];
        for (int i = 0; i < b.length(); i++) {
            c[k] = b.charAt(i);
            k++;
        }
        return c;
    }

    private static void vivod(StringBuffer result){
        int col=0;
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i)==' ')
                col++;
        }
        System.out.println("Количество слов: "+(col+1));
    }
}

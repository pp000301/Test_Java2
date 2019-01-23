package String;

import java.util.Scanner;

import static java.lang.System.out;

/* Написать функцию, принимающую в качестве параметров имя, фамилию и отчество и возвращающую инициалы в формате Ф.И.О.
 Учесть, что входные параметры могут быть в любом регистре, а результирующая строка должна быть в верхнем.*/

public class Zadacha4 {
    public static void main(String[] args) {

        Scanner sr = new Scanner(System.in);
        out.println("Ведите  Имя");
        String name = sr.nextLine();
        out.println("Ведите  Фамилию");
        String surname = sr.nextLine();
        out.println("Ведите  Отчество");
        String middle_name = sr.nextLine();


        Vivod(name, surname, middle_name);

    }

    public static void Vivod(String name, String surname, String middle_name) {

        String result = name.charAt(0) + "." + surname.charAt(0) + "." + middle_name.charAt(0) + ".";
        out.println(result.toUpperCase());
    }


}

package String;

import java.util.Scanner;

import static java.lang.System.out;

public class Zadacha2 {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        out.println("Ведите строку ");
        String n = sr.nextLine();

        String newString=n.replaceAll(":\\(",":)");
        out.println("Result: "+newString);

    }

}


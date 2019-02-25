package concurrent;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.out;

public class Councurent2_2 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        boolean k=true;
        while (k) {
            Scanner sr = new Scanner(System.in);
            out.println("ВВедите строку ");
            list.add(sr.nextLine());
            if(sr.nextLine().equals("exit")){
                k=false;
                sr.close();
            }

    }




    }


}

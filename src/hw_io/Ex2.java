package hw_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Ex2 {

    public static void main(String[] args) throws IOException {

        List<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        for (int i = 0; i < 10000; i++) {
            list.add(rnd.nextInt(2000));
        }
        Collections.sort(list);

        File file = new File("E://Example.txt");

        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        int k = 0;

        FileWriter writer = new FileWriter("E://Example.txt");
        for (int i = 0; i < list.size(); i++) {

            k++;
            char text1;
            if (k < 100) {
                text1 = ' ';
            } else {
                text1 = '\n';
                k = 0;
            }

            String text = list.get(i).toString() + text1;


            try {
                writer.write(text);
                writer.flush();

            } catch (IOException ex) {

                System.out.println(ex.getMessage());
            }
        }

        writer.close();
    }
}

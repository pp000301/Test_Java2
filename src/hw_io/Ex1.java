package hw_io;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Ex1 {

    public static void main(String[] args) throws IOException {

        int[] a = new int[33];
        char[] b = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у',
                'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};

        try (FileReader reader = new FileReader("E://notes3.txt")) {

            int c;
            while ((c = reader.read()) != -1) {
                char k = (char) c;
                for (int i = 0; i < 33; i++) {
                    if (b[i] == Character.toLowerCase(k))
                        a[i]++;
                }

            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

        FileWriter writer = new FileWriter("E://notes2.txt");

        for (int i = 0; i < 33; i++) {
            String text = b[i] + "-" + String.valueOf(a[i]) + "\n";

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


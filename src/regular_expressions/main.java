package regular_expressions;




import java.io.*;
import java.nio.file.*;

public class main {
    public static void main(String[] args) {
        //String basePath = new File("").getAbsolutePath();
        Path basePath = (Path) FileSystems.getDefault();
        System.out.println(basePath);
        try{
            FileInputStream fstream = new FileInputStream("text.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                System.out.println(strLine);
            }
        }catch (IOException e){
            System.out.println("Ошибка");
        }

    }


}

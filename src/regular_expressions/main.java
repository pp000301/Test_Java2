package regular_expressions;




import java.io.*;


public class main {
    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream("E://text.txt"))
        {
            StringBuffer strBuffer = new StringBuffer();
            int i=-1;
            while((i=fin.read())!=-1){
                strBuffer.append((char)i);
            }
            System.out.println(strBuffer);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());

        }

       final byte a=2;

    }



}

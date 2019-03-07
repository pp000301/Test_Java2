package hw_concurren.hw_1;

import java.io.InputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Ex1 {

    public static void main(String[] args) {
        String url = "https://javadevblog.com/sitemap.xml";

        new Thread(() -> {

            try {
                download(url, "file1");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();

        new Thread(() -> {

            try {
                download(url, "file2");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();

    }


    public static void download(String url, String fileName) throws Exception {
        InputStream in = URI.create(url).toURL().openStream();
        Files.copy(in, Paths.get(fileName));

    }
}

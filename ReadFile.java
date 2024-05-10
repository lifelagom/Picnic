import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile{

    private static String[] arr = {};

    public static String[] ReadWords(String path) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(path));
            arr = in.readLine().replaceAll("\\s+", " ").split(" ");
            in.close();
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл " + path);
            e.printStackTrace(); 
        }
        return arr;
    }
}
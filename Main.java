import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String file = "input.txt";
        String[] arr = {};
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            arr = in.readLine().replaceAll("\\s+", " ").split(" ");
            in.close();
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл " + file);
            e.printStackTrace();
        }
        Basket basket = new Basket(arr);
        System.out.println("Количество слов в файле: " + basket.AllFoodCount()+"\n");
        System.out.println("Самое длинное слово: " + basket.MaxLengthFoodsName()+"\n");
        System.out.println(basket);
    }
}
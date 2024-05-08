import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String file = "input.txt";
        HashMap<String, Integer> fruts = new HashMap<>();
        String[] arr = {};
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            arr = in.readLine().replaceAll("\\s+", " ").split(" ");
            in.close();
        } catch (IOException e) {
            System.out.println("Невозможно прочитать файл " + file);
            e.printStackTrace(); 
        }
        for (int index = 0; index < arr.length; index++) {
            if (fruts.containsKey(arr[index])) {
                fruts.put(arr[index], fruts.get(arr[index])+1);
            } else {fruts.put(arr[index], 1);}               
        }
        int count = 0;
        String maxWordLength = "";
        for (String frut : fruts.keySet()) {
            count += fruts.get(frut);
            if (frut.length()>maxWordLength.length()) {
                maxWordLength = frut;
            }
            System.out.println("фрукт "+frut+" в количестве: "+fruts.get(frut)+" шт.");            
        }
        System.out.println("_____________________________");
        System.out.println("Количество слов в файле: " + count);
        System.out.println("_____________________________");
        System.out.println("Самое длинное слово: " + maxWordLength);
        System.out.println("_____________________________");
    }
}
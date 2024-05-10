public class Main {
    public static void main(String[] args) {
        String[] arr = ReadFile.ReadWords("input.txt");
        if (arr.length>0) {
            Basket basket = new Basket(arr);
            System.out.println("Количество слов в файле: " + basket.AllFoodCount()+"\n");
            System.out.println("Самое длинное слово: " + basket.MaxLengthFoodsName()+"\n");
            System.out.println(basket);
        }
    }
}
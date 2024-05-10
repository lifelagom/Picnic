import java.util.HashMap;

public class Basket {

    private HashMap<String, Integer> food = new HashMap<>();

    public Basket(String[] arr) {
        for (int index = 0; index < arr.length; index++) {
            if (food.containsKey(arr[index])) {
                food.put(arr[index], food.get(arr[index])+1);
            } else {food.put(arr[index], 1);}               
        }
    }

    public int AllFoodCount() {
        int count = 0;
        for (int foodCount : food.values()) {
            count += foodCount;
        }
        return count;
    }

    public String MaxLengthFoodsName() {
        String maxName = "";
        for (String name : food.keySet()) {
            if (name.length()>maxName.length()) {
                maxName = name;
            }
        }
        return maxName;
    }

    @Override
    public String toString() {
        String basketOfFood = "В корзине лежит: \n";
        for (String name : food.keySet()) {
            basketOfFood += name+" в количестве: "+food.get(name)+" шт.\n";            
        }
        return basketOfFood;
    }

}
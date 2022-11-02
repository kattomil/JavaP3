import fruits.Apple;
import fruits.Banana;
import fruits.Fruit;
import fruits.Mango;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class InputDevice {

    public String getType(){
        return "random";
    }

    public int[] getNumbers(int n){
        int[] numbers = new int[n];
        for(int idx = 0; idx < n;idx++){
            numbers[idx] = this.nextInt();
        }

        return numbers;
    }

    public String getLine() {
        return "The quick brown fox jumps over the lazy dog";
    }

    public int nextInt() {
        Random rand = new Random();
        return rand.nextInt(100);
    }

    public ArrayList<Fruit> readFruit(){
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Banana(15, 3, 6));
        fruits.add(new Banana(25, 19, 2));
        fruits.add(new Apple(11, 4, 8, Fruit.Color.RED));
        fruits.add(new Mango(20, 4, 4, Fruit.Color.GREEN));
        return fruits;
    }

    public HashMap<String, Integer> countFruit(ArrayList<Fruit> fruits) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 0);
        map.put("Apple", 0);
        map.put("Mango", 0);
        for (Fruit value : fruits) {
            String fruit = value.getName();
            map.put(fruit, map.get(fruit) + 1);
        }
        return map;
    }
}

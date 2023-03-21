package homework.lesson66.task2.com.fruitbase;

import homework.lesson66.task2.com.fruitbase.fruits.Fruit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Cargo {
    private ArrayList<Fruit> fruits = new ArrayList<>();

    public double getWeight() {
        double sum = 0.0;
        for (Fruit fruit: fruits) {
            sum = sum + fruit.getWeight();
        }
        return sum;
    }

    public BigDecimal getPrice() {

        BigDecimal sum = new BigDecimal(0);
        for (Fruit fruit: fruits) {
            sum = sum.add(fruit.getPrice());
        }
        return sum;
    }

    void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public Cargo(List<Fruit> fruits) {
        for (Fruit fruit:fruits) {
            addFruit(fruit);
        }
    }

    public ArrayList<Fruit> getFruits() {
        return fruits;
    }
}

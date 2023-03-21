package homework.lesson66.task2.com.fruitbase;

import homework.lesson66.task2.com.fruitbase.fruits.*;

import java.math.BigDecimal;
import java.util.ArrayList;

public class FruitCatalogue {
    private ArrayList<Fruit> fruits = new ArrayList<>();


    Fruit findFruit(String fruit) {
        for (Fruit frt : fruits) {
            if (frt.getName().equals(fruit))
                return frt;
        }
        return null;
    }

    public FruitCatalogue() {
        fruits.add(new Apple(0.1, new BigDecimal(40.0), "Apple"));
        fruits.add(new Banana(0.4, new BigDecimal(80.0), "Banana"));
        fruits.add(new Orange(0.14, new BigDecimal(50.0), "Orange"));
        fruits.add(new Pineapple(0.5, new BigDecimal(180.0), "Pineapple"));
    }
}

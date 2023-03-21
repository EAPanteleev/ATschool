package homework.lesson66.task2.com.fruitbase;

import homework.lesson66.task2.com.fruitbase.fruits.Fruit;

import java.util.ArrayList;

public class FruitBase {
    public static void main(String[] args) {
        FruitBase fruitBase = new FruitBase();
        if (args.length == 0) {
            System.out.println("Пустой запрос");
            System.exit(0);
        } else fruitBase.takeOrder(args);

        System.out.println("Цена заказа = " + fruitBase.takeOrder(args).getPrice() + " Рублей" + "\n"
                + "Вес заказа = " + fruitBase.takeOrder(args).getWeight() + " Кг" + "\n"
                + "Состав заказа: " + fruitBase.takeOrder(args).getFruits());
    }

    private FruitCatalogue fruitCatalogue;

    public Cargo takeOrder(String[] order) {

        ArrayList<Fruit> list = new ArrayList<>();
        for (String orders : order) {
            if (fruitCatalogue.findFruit(orders) != null) {
                list.add(fruitCatalogue.findFruit(orders));
            }
        }

        if (list.size() == 0) {
            System.out.println("Таких фруктов нет");
        } else {
            return new Cargo(list);
        }
        return new Cargo(list);
    }

    public FruitBase() {
        fruitCatalogue = new FruitCatalogue();
    }
}

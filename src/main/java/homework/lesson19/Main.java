package homework.lesson19;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Шарик", "мясо", 2, "Дом", 2, true);
        Animal cat = new Cat("Барсик", "молоко", 2, "Дом", 1, false);
        Animal horse = new Horse("Шрек", "сено", 2, "Конюшня", 20, true);

        ArrayList<Animal> list = new ArrayList<>();
        list.add(dog);
        list.add(cat);
        list.add(horse);

        for (Animal a : list) {
            System.out.println(a.toString());
        }
        for (Animal a : list) {
            a.makeSound();
        }
        for (Animal a : list) {
            a.eat();
        }
        for (Animal a : list) {
            Vet.treatAnimal(a);
        }
        for (Animal a : list) {
            a.sleep();
        }
    }
}

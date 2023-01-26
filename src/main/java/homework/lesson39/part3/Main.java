package homework.lesson39.part3;

import static homework.lesson39.part3.Animal.testStaticMethod;

public class Main {
    public static void main(String[] args) {
        Animal.testStaticMethod();
        Cat.testStaticMethod();
        testStaticMethod();
        System.out.println(Animal.planet);
        Animal.planet = "Луна";
        Cat cat = new Cat();
        System.out.println(cat.getPlanet());
    }
}

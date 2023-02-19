package homework.lesson39.part1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Cat cat1 = new Cat(7);
        Cat cat2 = new Cat(7, "черные");
        Cat cat3 = new Cat(7, "черные", 15);
        Cat cat4 = new Cat(7, "черные", 15, "белая");
        Stream.of(cat, cat1, cat2, cat3, cat4)
                .forEach(System.out::println);

    }
}

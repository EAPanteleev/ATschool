package homework.lesson19;

public class Vet {
    private static final String name = "Айболит";

    static void treatAnimal(Animal animal) {
        if (animal.health.equalsIgnoreCase("Unhealthy")) {
            animal.health = "Healthy";
            System.out.println("Попровляйтесь");
        } else System.out.println("Вы здоровы");
    }
}

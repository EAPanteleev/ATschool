package homework.lesson19;

public class Vet {
    private static final String name = "Айболит";

    static void treatAnimal(Animal animal) {
        if (animal.health.equals(HealthState.UNHEALTHY)) {
            animal.health = HealthState.HEALTH;
            System.out.println("Попровляйтесь");
        } else System.out.println("Вы здоровы");
    }
}

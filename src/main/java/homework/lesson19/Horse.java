package homework.lesson19;

public class Horse extends Animal {

    protected static int counter;

    public Horse(String name, String food, int foodCounter, String location, HealthState health) {
        super(name, food, foodCounter, location, health);
        counter++;
    }

    @Override
    void makeSound() {
        System.out.println("Игого получается");
    }
}

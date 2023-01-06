package homework.lesson19;

public class Horse extends Animal {
    public Horse(String name, String food, int foodCounter, String location, int counter, boolean health) {
        super(name, food, foodCounter, location, counter, health);
    }

    @Override
    void makeSound() {
        System.out.println("Игого получается");
    }
}

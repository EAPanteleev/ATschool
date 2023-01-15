package homework.lesson19;

public class Cat extends Animal {
    public Cat(String name, String food, int foodCounter, String location, int counter, HealthState health) {
        super(name, food, foodCounter, location, counter, health);
    }

    @Override
    void makeSound() {
        System.out.println("Мяу");
    }
}

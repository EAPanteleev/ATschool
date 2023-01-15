package homework.lesson19;

public class Dog extends Animal {

    public Dog(String name, String food, int foodCounter, String location, int counter, HealthState health) {
        super(name, food, foodCounter, location, counter, health);
    }

    @Override
    void makeSound() {
        System.out.println("ГАф");
    }

}

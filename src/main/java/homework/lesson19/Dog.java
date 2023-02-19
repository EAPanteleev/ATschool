package homework.lesson19;

public class Dog extends Animal {

    protected static int counter;

    public Dog(String name, String food, int foodCounter, String location, HealthState health) {
        super(name, food, foodCounter, location,  health);
        counter++;
    }

    @Override
    void makeSound() {
        System.out.println("ГАф");
    }

}

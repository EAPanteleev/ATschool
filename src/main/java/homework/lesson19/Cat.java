package homework.lesson19;

public class Cat extends Animal {

    protected static int counter;

    public Cat(String name, String food, int foodCounter, String location,HealthState health) {
        super(name, food, foodCounter, location, health);
        counter++;
    }

    @Override
    void makeSound() {
        System.out.println("Мяу");
    }
}

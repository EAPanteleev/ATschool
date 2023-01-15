package homework.lesson19;

public abstract class Animal {
    protected String name;
    protected String food;
    protected int foodCounter;
    protected String location;
    protected static int counter;
    protected HealthState health;

    abstract void makeSound();

    void eat() {
        if (foodCounter > 0) {
            System.out.println(name + " Ест");
            foodCounter--;
        } else System.out.println("Еды нет");
    }

    void sleep() {
        System.out.println(name + " Спит");
    }

    public Animal(String name, String food, int foodCounter, String location, int counter, HealthState health) {
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        Animal.counter++;
        this.health = health;
    }

    @Override
    public String toString() {
        return name + '\n' +
                "location=" + location + '\n' +
                "health=" + health + '\n' +
                "counter=" + counter + '\n';
    }
}

package homework.lesson19;

public abstract class Animal {
    protected String name;
    protected String food;
    protected int foodCounter;
    protected String location;
    protected int counter;
    protected String health;

    abstract void makeSound();

    void eat() {
        System.out.println(name + " Ест");
        foodCounter--;
    }

    void sleep() {
        System.out.println(name + " Спит");
    }

    public Animal(String name, String food, int foodCounter, String location, int counter, boolean health) {
        this.name = name;
        this.food = food;
        this.foodCounter = foodCounter;
        this.location = location;
        this.counter = counter;
        this.health = health ? "HEALTHY" : "UNHEALTHY";
    }

    @Override
    public String toString() {
        return name + '\n' +
                "location=" + location + '\n' +
                "health=" + health + '\n' +
                "counter=" + counter + '\n';
    }
}

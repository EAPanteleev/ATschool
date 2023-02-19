package homework.lesson39.part1;

public class Cat {
    int age;
    String colorEyes;
    int weight;
    String colorWool;

    public Cat() {
    }

    public Cat(int age) {
        this.age = age;
    }

    public Cat(String colorEyes) {
        this.colorEyes = colorEyes;
    }

    public Cat(int age, String colorEyes) {
        this.age = age;
        this.colorEyes = colorEyes;
    }

    public Cat(String colorWool, String colorEyes) {
        this.colorWool = colorWool;
        this.colorEyes = colorEyes;
    }

    public Cat(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public Cat(String colorWool, int weight) {
        this.colorWool = colorWool;
        this.weight = weight;
    }

    public Cat(int age, String colorEyes, String colorWool) {
        this.age = age;
        this.colorEyes = colorEyes;
        this.colorWool = colorWool;
    }

    public Cat(int age, int weight, String colorWool) {
        this.age = age;
        this.weight = weight;
        this.colorWool = colorWool;
    }

    public Cat(int age, String colorEyes, int weight) {
        this.age = age;
        this.colorEyes = colorEyes;
        this.weight = weight;
    }

    public Cat(int age, String colorEyes, int weight, String colorWool) {
        this.age = age;
        this.colorEyes = colorEyes;
        this.weight = weight;
        this.colorWool = colorWool;

    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", colorEyes='" + colorEyes + '\'' +
                ", weight=" + weight +
                ", colorWool='" + colorWool + '\'' +
                '}';
    }
}

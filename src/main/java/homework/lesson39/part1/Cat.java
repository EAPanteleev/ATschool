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

    public Cat(int age, String colorEyes) {
        this.age = age;
        this.colorEyes = colorEyes;
    }

    public Cat(int age, String colorEyes, int weight) {
        this.age = age;
        this.colorEyes = colorEyes;
        this.weight = weight;
    }

    public Cat(int age, String colorEyes, Integer weight) {
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

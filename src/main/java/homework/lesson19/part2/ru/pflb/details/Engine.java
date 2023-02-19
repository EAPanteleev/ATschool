package homework.lesson19.part2.ru.pflb.details;

public class Engine {
    private final double power;
    private final String vendor;

    public Engine(double power, String vendor) {
        this.power = power;
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return vendor + "-" + power;
    }
}

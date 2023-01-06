package homework.lesson19.part2.ru.pflb.vehicles;

import homework.lesson19.part2.ru.pflb.details.Engine;
import homework.lesson19.part2.ru.pflb.professions.Driver;

public class Car {
    protected final String model;
    protected final VehicleClass vehicleClass;
    protected final int weight;
    protected Driver driver;
    protected Engine engine;

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    public Car(String model, VehicleClass vehicleClass, int weight, Driver driver, Engine engine) {
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return
                "model:" + model + '\n' +
                        "vehicleClass:" + vehicleClass + '\n' +
                        "characteristics: " + '\n' +
                        "  weight:" + weight + '\n' +
                        "  engine:" + engine + '\n' +
                        "driver:" + driver + '\n';
    }
}

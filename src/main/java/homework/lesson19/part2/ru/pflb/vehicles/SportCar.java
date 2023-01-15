package homework.lesson19.part2.ru.pflb.vehicles;

import homework.lesson19.part2.ru.pflb.details.Engine;
import homework.lesson19.part2.ru.pflb.professions.Driver;

public class SportCar extends Car {
    private final int maxVelocity;

    public SportCar(String model, int weight, Driver driver, Engine engine, int maxVelocity) {
        super(model, VehicleClass.SPORTS_CAR, weight, driver, engine);
        this.maxVelocity = maxVelocity;
    }

    @Override
    public String toString() {
        return
                super.toString() + '\n' +
                        "  maxVelocity: " + maxVelocity + '\n' +
                        "driver:" + driver + '\n';
    }
}

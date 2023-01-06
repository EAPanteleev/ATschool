package homework.lesson19.part2.ru.pflb.vehicles;

import homework.lesson19.part2.ru.pflb.details.Engine;
import homework.lesson19.part2.ru.pflb.professions.Driver;

public class Lorry extends Car {
    private final int loadingAmount;


    public Lorry(String model, int weight, Driver driver, Engine engine, int loadingAmount) {
        super(model, VehicleClass.LARGE, weight, driver, engine);
        this.loadingAmount = loadingAmount;
    }

    @Override
    public String toString() {
        return
                "model:'" + model + '\n' +
                        "vehicleClass:" + vehicleClass + '\n' +
                        "characteristics:" + '\n' +
                        "  weight:" + weight + '\n' +
                        "  engine:" + engine + '\n' +
                        "  loadingAmount:" + loadingAmount + '\n' +
                        "driver:" + driver + '\n';
    }
}

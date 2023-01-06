package homework.lesson19.part2.ru.pflb;

import homework.lesson19.part2.ru.pflb.details.Engine;
import homework.lesson19.part2.ru.pflb.professions.Driver;
import homework.lesson19.part2.ru.pflb.vehicles.Car;
import homework.lesson19.part2.ru.pflb.vehicles.Lorry;
import homework.lesson19.part2.ru.pflb.vehicles.SportCar;
import homework.lesson19.part2.ru.pflb.vehicles.VehicleClass;

public class Main {
    public static void main(String[] args) {
        Driver driver = new Driver(30, "Петя", 12, "28912314");
        Engine engineForLorry = new Engine(2000.00, "Kamaz");
        Engine engineForSportCar = new Engine(1200.00, "Lada");
        Engine engineForCar = new Engine(700.00, "Toyota");

        Car lorry = new Lorry("Kamaz", 8000, driver, engineForLorry, 2000);
        Car sportCar = new SportCar("Lada", 8000, driver, engineForSportCar, 380);
        Car car = new Car("Toyota", VehicleClass.LUXURY, 2000, driver, engineForCar);

        System.out.println(lorry);
        System.out.println(sportCar);
        System.out.println(car);
    }
}

package homework.lesson19.part2.ru.pflb.professions;

import homework.lesson19.part2.ru.pflb.Person;

public class Driver extends Person {
    private int drivingExperience;
    private String licenseId;

    public Driver(int age, String name, int drivingExperience, String licenseId) {
        super(age, name);
        this.drivingExperience = drivingExperience;
        this.licenseId = licenseId;
    }

    @Override
    public String toString() {
        return super.toString() + '\n' +
                "drivingExperience:" + drivingExperience + '\n' +
                "licenseId:" + licenseId + '\n';
    }
}

package hw8.human;

import hw8.DayOfWeek;

import java.util.Map;

public final class Man extends Human {

    public Man(String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man() {
    }

    public Man(String name, String surname, int year, int iq) {
        super(name, surname, year, iq);
    }

    public Man(String name, String surname, int year, int iq, Map<DayOfWeek, String> schedule) {
        super(name, surname, year, iq, schedule);
    }

    void greetPet() {
        System.out.printf("Hello, %s\n", getFamily().getPet().getNickname());
    }

    public void repairCar() {
        System.out.println("Repair car.");
    }
}

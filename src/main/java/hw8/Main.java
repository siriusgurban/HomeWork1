package hw8;

import hw8.human.Man;
import hw8.human.Woman;
import hw8.pet.Dog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashSet<String> habits = new HashSet<String>() {{
            add("sleep");
            add("eat");
        }};
        Dog dog = new Dog("Rock", 5, 75, habits);
        Map<DayOfWeek, String> schedule = new HashMap<DayOfWeek, String>() {{
            put(DayOfWeek.SUNDAY, "Repair car");
        }};

        Man father = new Man("Donatello","Cell", 1960,77, schedule);
        Woman mother = new Woman("April","Cell", 1970,777);

        Family fmd = new Family(father, mother, dog);
        System.out.println(fmd);
        father.repairCar();
        mother.makeup();
        System.out.println(schedule.get(DayOfWeek.SUNDAY));
    }
}

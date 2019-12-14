package hw9;

import hw9.dao.controller.FamilyController;
import hw9.family.Family;
import hw9.humans.Man;
import hw9.humans.Woman;
import hw9.pets.Dog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashSet<String> habits = new HashSet<String>() {{
            add("eat");
            add("play");
        }};
        Dog dog = new Dog("Rock", 5, 75, habits);
        Map<DayOfWeek, String> schedule = new HashMap<DayOfWeek, String>() {{
            put(DayOfWeek.MONDAY, "Repair car.");
        }};

        Man father = new Man("Donatello","Cell", 1960,77, schedule);
        Woman mother = new Woman("April","Cell", 1970,777);
        Man father1 = new Man("Leonardo", "Cell", 1947, 154);
        Woman mother1 = new Woman("May", "Cell", 1937, 99);
        Man child = new Man("Raphael", "Cell", 1971, 101);

        FamilyController controller = new FamilyController();
        Family family = new Family(father, mother);

        controller.addFamily(family);
        controller.createNewFamily(father1, mother1);
        controller.adoptChild(family, child);
        controller.count();
        controller.addPet(0, dog);
        controller.createNewFamily(father1, mother1);
        controller.displayAllFamilies();
        controller.getPets(0);
        controller.deleteAllChildrenOlderThen(18);
        controller.deleteFamilyByIndex(1);
        controller.getFamilyById(0);
        controller.countFamiliesWithMemberNumber(2);
        controller.getFamiliesBiggerThan(1);
        controller.getFamilyLessThan(3);
        controller.getAllFamilies();
        controller.displayAllFamilies();


    }
}

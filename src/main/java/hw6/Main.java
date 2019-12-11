package hw6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet(Species.DOG, "Rock", 5, 75, new String[]{"eat", "sleep"});
        Human grandfather = new Human();
        Human father  = new Human("Donatello","Cell", 1960) ;
        Human mother = new Human("April","Cell", 1970);
        Human child1 = new Human("Michelangelo","Cell", 1994, 90, new String[][]{{DayOfWeek.SUNDAY.name(), "Task_1"}, {DayOfWeek.FRIDAY.name(), "Task_2"}});



        System.out.println(child1);
        System.out.println(father);
        Family family = new Family(father, mother);
        family.addChild(child1);
        System.out.println(Arrays.toString(family.getChildren()));

    }
}
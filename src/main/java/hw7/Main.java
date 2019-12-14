package hw7;

import hw7.human.Man;
import hw7.human.Woman;
import hw7.pet.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Rock", 5, 75, new String[]{"eat", "sleep"});
        Man father = new Man("Donatello","Cell", 1960,77);
        Woman mother = new Woman("April","Cell", 1970,777);

        Family fmd = new Family(father, mother, dog);
        System.out.println(fmd);
        father.repairCar();
        mother.makeup();
    }
}
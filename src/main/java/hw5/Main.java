package hw5;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Dog", "Rock", 5, 75, new String[]{"eat", "sleep"});
        Human grandfather = new Human();
        Human father  = new Human("Donatello","Cell", 1960) ;
        Human mother = new Human("April","Cell", 1970);
        Human child1 = new Human("Michelangelo","Cell", 1995, 100,  new String[1][1]);
        Human child2 = new Human("Raffaello","Cell", 1994, 90,  new String[][]{{"Day_1", "Task_1"}, {"Day_2", "Task_2"}});


        Family cellFamily = new Family(father, mother);
        System.out.println(cellFamily);
        cellFamily.addChild(child1);
        System.out.println(cellFamily);
        System.out.println(father.getFamily());
        cellFamily.addChild(child2);
        System.out.println(child2.getFamily());
        cellFamily.deleteChild(0);
        System.out.println(child1.getFamily());
        System.out.println(mother.getFamily());
        System.out.println(father.hashCode());
        System.out.println(cellFamily.hashCode());
        cellFamily.addChild(child2);
        System.out.println(cellFamily.hashCode());
    }
}
package hw4;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Pet("Dog", "Rock", 5, 75, new String[]{"eat, drink, sleep"});
        Human grandfather = new Human();
        Human father  = new Human("Donatello","Cell", 1960) ;
        Human mother = new Human("April","Cell", 1970);
        Human child = new Human("Michelangelo","Cell", 1995, 100, dog, father, mother, new String[1][1]);


        System.out.println(child);
        child.describePet();
        child.greetPet();
        System.out.printf("Grandmaster %s ",grandfather);
        System.out.printf("Father %s \n",father);
        System.out.printf("Mother %s \n",mother);
    }
}
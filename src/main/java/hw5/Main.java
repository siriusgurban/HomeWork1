package hw5;


public class Main {

    public static void main(String[] args)
    {
        Pet pet1 = new Pet("dog","Rock",5, 75, "eat, drink, sleep");
        Pet pet2 = new Pet("dog", "Rock");
        pet1.getEat();
        pet1.getRespond();
        pet1.getFoul();

        System.out.println(pet1.toString());


        Human someBody = new Human("Michael","Karleone",1977,90,"Jane Karleone","Vito Karleone","pet");
        someBody.getGreetPet();
        someBody.getDescribePet();
        Human mother = new Human();
        Human father = new Human();
        Pet pet = new Pet();

        System.out.println(someBody.toString() + pet1.toString());

//        Family.toString();
        System.out.println();


//        Pet dog = new Pet("dog","Rock",5, 75, "eat, drink, sleep");
//Human{name='Michael', surname='Karleone', year=1977, iq=90, mother=Jane Karleone, father=Vito Karleone, pet=dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}}
    }



}
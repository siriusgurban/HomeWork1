package hw4;

public class Human {

    String name;
    String surname;
    int year;
    int iq;
    String mother;
    String father;
    String pet;




    public Human(String name, String surname, int year, int iq, String mother, String father, String pet) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }


    public void getGreetPet()
    {
        System.out.println("Hello, + " );

    }


    public void getDescribePet()
    {
        System.out.println("I have a " + Pet.class.toString() +" he is " + "age");
    }




}




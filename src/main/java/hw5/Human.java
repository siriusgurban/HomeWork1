package hw5;

public class Human extends Pet{
    public String name;
    public String surname;
    public int iq;
    public int year;
    public String pet;
    public String mother;
    public String father;

    public void getGreetPet() {
        System.out.println("Hello, " + nickname);
    }


    public void getDescribePet() {
        System.out.println("I have a " + species + ", he is " + age + " years old, he is [very sly]>50/[almost not sly]<50");
    }



    public Human(String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year, String mother, String father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int year, int iq, String mother, String father, String pet) {
        this.name = name;
        this.surname = surname;
        this.iq = iq;
        this.year = year;
        this.mother = mother;
        this.father = father;
        this.pet = pet;
    }

    public Human() {

    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", iq=" + iq +
                ", year=" + year +
                ", pet='" + pet + '\'' +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                '}';
    }
//
//        public String toString()
//    {
//        return "Human" + "{"+ "name"+ "=" + name  + ", " + "surname" + "=" + surname + ", " + "year"+ "=" + year + ", "
//                + "iq"+ "=" + iq + ", " + "mother"+ "=" + mother + ", " + "father"+ "=" + father + ", ";
//    }



    //species + "{"+ "nickname"+ "="+ nickname  + ", " + "age" + "=" + age + ", "+ "trickLevel"+ "=" + trickLevel + ", "+ "habits" + "=["+ habits + "]}"

}

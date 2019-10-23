package hw4;

public class Main {



    public static void main(String[] args)
    {
        Pet dog = new Pet("dog","Rock",6, 75, "eat, drink, sleep");
        dog.getEat();
        dog.getRespond();
        dog.getFoul();


        System.out.println(dog.toString());





//        Pet.class.toString();
//        {
//            return(this.getNickname() + this.getAge()+ this.getTrickLevel() + this.getHabits());
//
//        }

//        Pet dog = new Pet("dog","Rock",5, 75, "eat, drink, sleep");

    }

    public static void main1(String[] args)
    {
        Human human = new Human("Michael", "Karleone", 1977, 90, "Jane Karleone", "Vito Karleone", "sd");
        System.out.println(human.toString());
    }







}


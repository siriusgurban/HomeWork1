package hw4;

public class Pet {

    String species;
    String nickname;
    int age;
    int trickLevel;
    String habits;


    public Pet(String species, String nickname, int age, int trickLevel, String habits)
    {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }


    public void getEat()
    {
        System.out.println("I am eating");

    }


    public void getRespond()
    {
        System.out.println("Hello, owner. I am - " + species + ". " + "I miss you!");
    }


    public void getFoul()
    {
        System.out.println("I need to cover it up");
    }


    public String getSpecies() {
        return species;
    }

    public String getHabits() {
        return habits;
    }

    public int getTrickLevel() {
        return trickLevel;
    }

    public int getAge() {
        return age;
    }


    public String getNickname(){
        return nickname;
    }

    @Override
    public String toString(){
        return(this.getSpecies() + "{" + "nickname=" + "'" + this.getNickname()+"'" + ", " + "age" + "=" + this.getAge()+ ", " + "trickLevel" + "="  + this.getTrickLevel() + ", " + "habits" + "[" + this.getHabits() + "]"+ "}");
    };

//    dog{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}
}



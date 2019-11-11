package hw5;

public class Pet {

    public String species;
    public String nickname;
    public int age;
    public int trickLevel;
    public String habits;

    public Pet(String species, String nickname, int age, int trickLevel, String habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet() {

    }



    public void getEat() {
        System.out.println("I am eating");
    }


    public void getRespond() {
        System.out.println("Hello, owner. I am - " + species + ". " + "I miss you!");
    }


    public void getFoul() {
        System.out.println("I need to cover it up");
    }



//    public String toString()
//    {
//        return species + "{"+ "nickname"+ "="+ nickname  + ", " + "age" + "=" + age + ", "+ "trickLevel"+ "=" + trickLevel + ", "+ "habits" + "=["+ habits + "]}";
//    }


    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits='" + habits + '\'' +
                '}';
    }
}


package hw5;

import java.util.Arrays;

public class Family extends Human{

    Human mother = new Human();
    Human father = new Human();
    Human cildren[] = new Human[0];
    Pet pet = new Pet();

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getCildren() {
        return cildren;
    }

    public void setCildren(Human[] cildren) {
        this.cildren = cildren;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }


    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", cildren=" + Arrays.toString(cildren) +
                ", pet=" + pet +
                '}';
    }


    public Family(String name, String surname, int year, Human mother, Human father, Human[] cildren, Pet pet) {
        super(name, surname, year);
        this.mother = mother;
        this.father = father;
        this.cildren = cildren;
        this.pet = pet;
    }

    public Family(String name, String surname, int year, String mother, String father, Human mother1, Human father1, Human[] cildren, Pet pet) {
        super(name, surname, year, mother, father);
        this.mother = mother1;
        this.father = father1;
        this.cildren = cildren;
        this.pet = pet;
    }

    public Family(String name, String surname, int year, int iq, String mother, String father, String pet, Human mother1, Human father1, Human[] cildren, Pet pet1) {
        super(name, surname, year, iq, mother, father, pet);
        this.mother = mother1;
        this.father = father1;
        this.cildren = cildren;
        this.pet = pet1;
    }

    public Family(Human mother, Human father, Human[] cildren, Pet pet) {
        this.mother = mother;
        this.father = father;
        this.cildren = cildren;
        this.pet = pet;
    }
}

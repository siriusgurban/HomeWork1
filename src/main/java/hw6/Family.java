package hw6;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Family {

    private Human father;
    private Human mother;
    private Pet pet = new Pet();
    private Human[] children;

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public Pet getPet() {
        return pet;
    }


    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }


    Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new Human[0];
        this.pet = pet;
        father.setFamily(this);
        mother.setFamily(this);

    }




    int countFamily() {
        return 2 + this.children.length;
    }

    @Override
    public String toString() {
        if (this.children.length == 0 && pet.getSpecies() == null) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    '}';
        } else if (this.children.length == 0 && pet.getSpecies() != null) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", pet=" + pet +
                    '}';
        } else if (this.children.length != 0 && pet.getSpecies() == null) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", children=" + Arrays.toString(children) +
                    ", people in family=" + this.countFamily() +
                    '}';
        } else {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", pet=" + pet +
                    ", children=" + Arrays.toString(children) +
                    '}';
        }
    }




    @Override
    public boolean equals(Object that) {
        if (that == null || getClass() != that.getClass()) return false;
        if (this == that) return true;
        Family family = (Family) that;
        return Objects.equals(father, family.father) &&
                Objects.equals(mother, family.mother) &&
                Arrays.equals(children, family.children);
    }


    @Override
    public int hashCode() {
        int result = Objects.hash(father, mother);
        result = 21 * result + Arrays.hashCode(children) * children.length * -1;
        return result;
    }
}
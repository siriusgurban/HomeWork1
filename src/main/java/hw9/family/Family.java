package hw9.family;

import hw9.humans.*;
import hw9.pets.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Family {

    private Human father;
    private Human mother;
    private ArrayList<Pet> pet;
    private List<Human> children;

    public Human getFather() {
        return father;
    }

    public Human getMother() {
        return mother;
    }

    public ArrayList<Pet> getPet() {
        return pet;
    }

    public List<Human> getChildren() {
        return children;
    }

    public Family(Human father, Human mother) {
        this.father = father;
        this.mother = mother;
        this.children = new ArrayList<>();
        this.pet = new ArrayList<>();
        father.setFamily(this);
        mother.setFamily(this);
    }

    public void addChild(Human child) {
        children.add(child);
        child.setFamily(this);
    }

    public void deleteChild(int index) {
        children.get(index).setFamily(null);
        children.remove(index);
    }

    public int countFamily() {
        return 2 + children.size();
    }

    @Override
    public String toString() {
        if (this.children.size() == 0 && pet.size() == 0) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", people in family=" + this.countFamily() +
                    "}\n";
        } else if (this.children.size() == 0 && pet.size() != 0) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", pet=" + pet +
                    ", people in family=" + this.countFamily() +
                    "}\n";
        } else if (this.children.size() != 0 && pet.size() == 0) {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", children=" + children +
                    ", people in family=" + this.countFamily() +
                    "}\n";
        } else {
            return "Family{" + "father=" + father +
                    ", mother=" + mother +
                    ", pet=" + pet +
                    ", children=" + children +
                    ", people in family=" + this.countFamily() +
                    "}\n";
        }
    }

    @Override
    public boolean equals(Object that) {
        if (that == null || getClass() != that.getClass()) return false;
        if (this == that) return true;
        Family family = (Family) that;
        return Objects.equals(father, family.father) &&
                Objects.equals(mother, family.mother) &&
                Objects.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(father, mother);
        result = 11 * result + children.size() * children.size() * -1;
        return result;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(this);
        super.finalize();
    }

}

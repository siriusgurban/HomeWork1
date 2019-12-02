package hw7;

import hw6.Human;
import hw6.Pet;

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



}
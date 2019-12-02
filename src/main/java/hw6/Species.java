package hw6;

public enum Species {
    CAT(false, 4, true),
    DOG(false, 4, true),
    TURTLE(false, 4, false),
    RAT(false, 4, true);



    private boolean canFly;
    private int numberOfLegs;
    private boolean hasFur;


    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }
}
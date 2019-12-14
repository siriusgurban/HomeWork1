package hw9.pets;

public enum Species {
    FISH(false, 0, false),
    DOMESTICCAT(false, 4, true),
    DOG(false, 4, true),
    ROBOCAT(false, 4, false),
    UNKNOWN;

    private boolean canFly;
    private int numberOfLegs;
    private boolean hasFur;

    Species() {
    }

    Species(boolean canFly, int numberOfLegs, boolean hasFur) {
        this.canFly = canFly;
        this.numberOfLegs = numberOfLegs;
        this.hasFur = hasFur;
    }
}

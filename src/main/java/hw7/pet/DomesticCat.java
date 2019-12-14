package hw7.pet;

import hw7.Species;

public final class DomesticCat extends Pet implements Fail {

    public DomesticCat() {
        super.setSpecies(Species.DOMESTICCAT);
    }

    public DomesticCat(String nickname) {
        super(nickname);
        super.setSpecies(Species.DOMESTICCAT);
    }

    public DomesticCat(String nickname, int age, int trickLevel, String[] habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.DOMESTICCAT);
    }

    void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", getNickname());
    }


    @Override
    public void foul() {
        System.out.println("I need to cover it up\n");
    }
}

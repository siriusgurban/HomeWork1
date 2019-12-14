package hw8.pet;

import hw8.Species;

import java.util.Set;

public final class RoboCat extends Pet implements Fail {

    public RoboCat() {
        super.setSpecies(Species.ROBOCAT);
    }

    public RoboCat(String nickname) {
        super(nickname);
        super.setSpecies(Species.ROBOCAT);
    }

    public RoboCat(String nickname, int age, int trickLevel, Set<String> habits) {
        super(nickname, age, trickLevel, habits);
        super.setSpecies(Species.ROBOCAT);
    }

    void respond() {
        System.out.printf("Hello, owner. I am - %s. I miss you!\n", getNickname());
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up\n");
    }
}

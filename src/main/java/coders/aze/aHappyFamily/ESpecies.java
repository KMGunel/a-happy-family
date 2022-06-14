package coders.aze.aHappyFamily;

public enum ESpecies {
    DOG(false),
    CAT(false),
    BIRD(true),
    RABBIT(false),
    TORTOISE(false);

    private final boolean canFly;
    ESpecies(boolean canFly){
        this.canFly=canFly;
    }

    public boolean getCanFly() {
        return canFly;
    }
}

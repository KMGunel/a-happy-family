package coders.aze.aHappyFamily;

public enum ESpecies {
    DOG(false,4,true),
    CAT(false,4,true),
    BIRD(true,2,false),
    RABBIT(false,4,true),
    TORTOISE(false,4,false);

    private final boolean canFly;
    private final int numberOfLegs;
    private final boolean hasFur;

    ESpecies(boolean canFly,int numberOfLegs,boolean hasFur){
         this.canFly=canFly;
         this.numberOfLegs=numberOfLegs;
         this.hasFur=hasFur;
    }

    public boolean getCanFly() {
        return canFly;
    }
    public int getNumberOfLegs() { return numberOfLegs; }
    public boolean getHasFur() { return hasFur; }
}

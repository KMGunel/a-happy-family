package coders.aze.aHappyFamily;

public class RoboCat extends Pet{

    public RoboCat(){
        super();
    }
    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am - %s . I miss you!\n", getNickname());
    }
}

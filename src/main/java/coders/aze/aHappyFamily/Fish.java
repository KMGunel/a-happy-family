package coders.aze.aHappyFamily;

public class Fish extends Pet{

    public Fish(){
        super();
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am - %s . I miss you!\n", getNickname());
    }
}

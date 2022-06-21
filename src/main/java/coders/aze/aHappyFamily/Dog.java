package coders.aze.aHappyFamily;

public class Dog extends Pet implements IDog{

    public Dog(){
        super();
    }

    @Override
    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public void respond() {
        System.out.printf("Hello, owner. I am - %s . I miss you!\n", getNickname());
    }
}

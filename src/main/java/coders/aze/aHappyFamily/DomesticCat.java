package coders.aze.aHappyFamily;

public class DomesticCat extends Pet implements IDomesticCat{

    public DomesticCat(){
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

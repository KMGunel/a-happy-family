package coders.aze.aHappyFamily;

public class Man extends Human implements IHumanCreator{

    private ENames childName;

    public ENames getChildName() {
        return childName;
    }

    public void setChildName(ENames childName) {
        this.childName = childName;
    }

    public void repairCar() {
        System.out.printf("Hello, %s",getName());
    }

    @Override
    public void bornChild() {
        System.out.printf("Hello.I was born.I am male.My father is %s. My name is %s .My iq is %s.",
                getName(), getChildName(), getIq());
    }
}



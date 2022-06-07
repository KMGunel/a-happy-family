package coders.aze.aHappyFamily;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Family {
    private Pet pet;
    private Human mother;
    private Human father;
    private Human[] children={};

    static {
        System.out.println("Family class is being loaded");
    }

    {
        System.out.println("A new object is created");
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public void greetPet() {
        System.out.printf("Hello, %s", pet.getNickname());
    }

    public void describePet() {
        System.out.printf("I have a %s, he is %d years old, he is %s",
                pet.getSpecies(), pet.getAge(), pet.getTrickLevel() > 50 ? "very sly" : "almost not sly");
    }

    public void addChild(Human child){
        Human[] newChildren = Arrays.copyOf(this.children,this.children.length+1);

        newChildren[this.children.length] = child;

        this.children = newChildren;

    }

    public boolean deleteChild(int index){
        if(index >= 0 && index < this.children.length){
            Human[] newChildren = new Human[this.children.length-1];

            for (int i = 0,j=0; i < this.children.length; i++) {
                if(index != i)  newChildren[j++] = this.children[i];
            }
            this.children = newChildren;
            return true;
        }
        else {
            return false;
        }
    }

    public int countFamily(){
        return 2+this.children.length;
    }

    public boolean feedPet(boolean bool) {
        if (bool || this.pet.getTrickLevel() > new Random().nextInt()) {
            System.out.printf("Hm... I will feed %s's %s", this.father.getName(), this.pet.getTrickLevel());
            return true;
        } else {
            System.out.printf("I think %s is not hungry", this.father.getName());
            return false;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(pet, family.pet) && Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(pet, mother, father);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Family{father=%s, mother=%s, pet=%s,children=%s}",
                father, mother, pet, Arrays.toString(children));
    }
}

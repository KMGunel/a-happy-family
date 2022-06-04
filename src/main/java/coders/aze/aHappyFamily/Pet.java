package coders.aze.aHappyFamily;

import java.util.Arrays;
import java.util.Objects;

public class Pet {
    private String species;
    private String nickname;
    private byte age;
    private byte trickLevel;
    private String[] habits;

    public String[] doghabits={"eat","drink","sleep"};


    public Pet() {

    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, byte age, byte trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public String getSpecies() {

        return species;
    }

    public void setSpecies(String species) {

        this.species = species;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {

        this.nickname = nickname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {

        this.age = age;
    }

    public byte getTrickLevel() {

        return trickLevel;
    }

    public void setTrickLevel(byte trickLevel) {

        this.trickLevel = trickLevel;
    }

    public String[] getHabits() {
        return habits;
    }

    public void setHabits(String[] habits) {
        this.habits = habits;
    }


    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.printf("Hello, owner. I am - %s . I miss you!\n", this.nickname);
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && Objects.equals(species, pet.species) && Objects.equals(nickname, pet.nickname) && Arrays.equals(habits, pet.habits) && Arrays.equals(doghabits, pet.doghabits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        result = 31 * result + Arrays.hashCode(doghabits);
        return result;
    }

    @Override
    public String toString() {
        return "dog{" +
                "nickname='" + "Rock" + '\'' +
                ", age=" + 5 +
                ", trickLevel=" + 75 +
                ", habits=" + Arrays.toString(doghabits) +
                '}';
    }
}
package coders.aze.aHappyFamily;

import java.util.Arrays;
import java.util.Objects;

public abstract class Pet {
    private ESpecies species = ESpecies.UNKNOWN;
    private String nickname;
    private byte age;
    private byte trickLevel;
    private String[] habits;

    static {
        System.out.println("Pet class is being loaded");
    }

    {
        System.out.println("A new object is created");
    }


    public Pet() {
    }

    public Pet(String nickname) {
                this.nickname = nickname;
    }

    public Pet(String nickname, byte age, byte trickLevel, String[] habits) {
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public ESpecies getSpecies() {

        return species;
    }

    public void setSpecies(ESpecies species) {

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

    public abstract void respond() ;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return age == pet.age && trickLevel == pet.trickLevel && species == pet.species && nickname.equals(pet.nickname) && Arrays.equals(habits, pet.habits);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(species, nickname, age, trickLevel);
        result = 31 * result + Arrays.hashCode(habits);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Pet{species=%s, nickname=%s, trickLevel=%d,age = %d, habits=%s}",
                ESpecies.DOG, nickname, trickLevel, age, Arrays.toString(habits));
    }
}
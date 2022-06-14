package coders.aze.aHappyFamily;

public class Main{
    public static void main( String[] args )
    {

     Human father = new Human("ata","Atayev", (short) 1964);
     Human mother = new Human("ana","Atayev", (short) 1968);
     Pet pet = new Pet(ESpecies.DOG,"Maks", (byte) 8, (byte) 90, new String[]{"barking", "greeting", "sleeping"});
     Human boy = new Human("ogul", "atayev",(short) 1999,(byte) 98,pet,mother,father, new String[][]{{"mondey","working"},{"tuesday","sleeping"}});
     Human girl = new Human("Girl","girl",(short)2003);
     father.setSchedule(new String[][]{{EDayOfWeek.MONDEY.toString(),"Walking"},{EDayOfWeek.THURSDAY.toString(),"Reading"}});

     Family family = new Family(father,mother);

        System.out.println(family);
        family.addChild(boy);
        family.addChild(girl);
        family.setPet(pet);
        System.out.println(family);
        System.out.println(family.countFamily());
        family.deleteChild(1);
        System.out.println(family);

    }
}


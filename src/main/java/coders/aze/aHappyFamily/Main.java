package coders.aze.aHappyFamily;

public class Main{
    public static void main( String[] args )
    {
     Human father = new Human("Pedro","Brown", (short) 1984);
        father.setSchedule(new String[][]{{EDayOfWeek.MONDEY.toString(),"Walking"},
                {EDayOfWeek.THURSDAY.toString(),"Reading"}});
        father.setIq((byte)88);

     Human mother = new Human("Lucia","Brown", (short) 1988);
     mother.setIq((byte)85);
     Human boy = new Human("Riley","Brown",(short)2011 );
     Human girl = new Human("Lauren","Brown",(short)2014);
     Man man = new Man();
     Woman woman= new Woman();


     Man childBoy = new Man();
     childBoy.setChildName(ENames.RILEY);
     childBoy.setIq((byte)((father.getIq() + mother.getIq())/2));
     man.bornChild();
     Woman childGirl = new Woman();
     childGirl.setChildName(ENames.MIA);
     childGirl.setIq((byte)((father.getIq() + mother.getIq())/2));
     woman.bornChild();


     Fish fish = new Fish();
     fish.setNickname("Betta");
     RoboCat roboCat = new RoboCat();
     roboCat.setNickname("Jake");
     Dog dog = new Dog();

     dog.setNickname("Max");
     DomesticCat domesticCat = new DomesticCat();
     domesticCat.setNickname("Chloe");

     Family family = new Family(father,mother);

        System.out.println(family);

        family.addChild(girl);
        family.addChild(boy);

        System.out.println(family);
        System.out.println(family.countFamily());
        family.deleteChild(1);
        System.out.println(family);

    }
}


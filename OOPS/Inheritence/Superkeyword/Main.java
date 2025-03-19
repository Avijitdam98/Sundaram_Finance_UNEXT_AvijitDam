package OOPS.Inheritence.Superkeyword;

public class Main {
    public static void main(String[] args) {
        Hero hero1=new Hero("Batman",32,"$$$");
        Hero hero2=new Hero("Superman",42,"%%%");
        System.out.println(hero1.name+" "+hero1.age+" "+hero1.Power);
        System.out.println(hero2.toString());
    }
}

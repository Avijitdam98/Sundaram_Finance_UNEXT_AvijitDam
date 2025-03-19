package OOPS.Inheritence.Superkeyword;

public class Hero extends Person {
    String Power;
    Hero(String name,int age,String Power){
        super(name,age);
        this.Power=Power;


    }

    @Override
    public String toString() {
        return "Hero{" +
                "Power='" + Power + '\'' +
                '}';
    }
}

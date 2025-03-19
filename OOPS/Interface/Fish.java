package OOPS.Interface;

public class Fish implements Prey,Predator{
    @Override
    public void flee() {
        System.out.println("Fish is hunting smaller fish");
    }

    @Override
    public void pred() {
        System.out.println("Fish is hunting larger fish");
    }
}

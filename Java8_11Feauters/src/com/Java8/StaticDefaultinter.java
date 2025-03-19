package com.Java8;

interface I1
{
    void meth();
    static void meth2() {
        System.out.println("i am static method");
    }
    default void defaultmethod() {
        System.out.println("i am in interface");
    }
}
class App implements I1
{
    public void meth()
    {
        System.out.println("instance method");
    }
    public void defaultmethod()
    {
        System.out.println("overridden default method");
    }
}
public class StaticDefaultinter {

    public static void main(String[] args) {
        I1 obj=new App();
        obj.meth();
        obj.defaultmethod();
        I1.meth2();
    }

}

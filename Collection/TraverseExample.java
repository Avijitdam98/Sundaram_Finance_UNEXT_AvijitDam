package Collection;

import java.util.ArrayList;

public class TraverseExample {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        names.add("Avinash");
        names.add("Ajay");
        names.add("Avijit");
        names.add("Arun");
        names.add("Nitin");

        for (String name:names) {
            System.out.println(name.length());
        }
    }
}

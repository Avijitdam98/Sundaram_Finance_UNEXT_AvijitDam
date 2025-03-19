package Collection;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Double> nms=new HashSet<>();
        nms.add(14.44);
        nms.add(34.244);
        nms.add(44.87);
        nms.add(90.32);
        nms.add(14.44);
       // System.out.println(nms);
        TreeSet<Double>nms2=new TreeSet<>();
        nms2.add(14.44);
        nms2.add(34.244);
        nms2.add(44.87);
        nms2.add(90.32);
        nms2.add(14.44);
        System.out.println(nms2);


    }
}

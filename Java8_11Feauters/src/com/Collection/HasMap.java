package com.Collection;

import java.util.*;
class Person{

}
public class HasMap {

    public static void main(String[] args) {
        Map<String,Integer>	m=new HashMap();
        m.put("ann",123);
        m.put("bann",1234);
        m.put("kann",124);
        m.put("bann",1222);

        System.out.println("printing using enhanced for loop");
        for(Map.Entry<String,Integer> p:m.entrySet())
        {
            System.out.println(p.getKey()+": "+p.getValue());
        }
        System.out.println("________________________________________________________________");
        System.out.println("printing keys");
        Set<String> s=m.keySet();
        for(String g:s)
        {
            System.out.println(g);
        }
        System.out.println("________________________________________________________________");
        System.out.println("printing values");
        Collection<Integer>p=m.values();
        for(Integer g:p)
        {
            System.out.println(g);
        }
    }

}
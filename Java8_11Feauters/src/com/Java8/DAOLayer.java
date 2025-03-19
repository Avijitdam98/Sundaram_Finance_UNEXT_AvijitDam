package com.Java8;

import java.util.ArrayList;
import java.util.Iterator;

public class DAOLayer {

    public Restaurent searchRestaurent(ArrayList<Restaurent> contacts, String info) {
        for (Restaurent restaurent : contacts) {
            if (restaurent.getName().equalsIgnoreCase(info)) {
                return restaurent;
            }
        }
        return null;
    }

    public void addRestaurent(ArrayList<Restaurent> al) {
        Iterator<Restaurent> iterator = al.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
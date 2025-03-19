package com.Java8;

import java.util.ArrayList;
import java.util.Scanner;

public class Source {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Restaurent> restaurents = new ArrayList<>();
        DAOLayer daoLayer = new DAOLayer();

        System.out.println("Enter the number of restaurents to add:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for restaurent " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Location: ");
            String location = scanner.nextLine();
            System.out.print("Cuisine: ");
            String cuisine = scanner.nextLine();
            System.out.print("Rating: ");
            String rating = scanner.nextLine();

            Restaurent restaurent = new Restaurent(name, location, cuisine, rating);
            restaurents.add(restaurent);
        }

        daoLayer.addRestaurent(restaurents);

        System.out.print("Enter the name of the restaurent to search: ");
        String searchName = scanner.nextLine();
        Restaurent foundRestaurent = daoLayer.searchRestaurent(restaurents, searchName);

        if (foundRestaurent != null) {
            System.out.println("Restaurent found:");
            System.out.println(foundRestaurent);
        } else {
            System.out.println("Restaurent not found.");
        }

        scanner.close();
    }
}
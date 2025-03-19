package com.JDBC;

import com.Connection.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertData {
    public static void main(String[] args) {
        try {
            Connection con = DbConnection.getConnection();

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the ID of the employee: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.println("Enter the Name of the employee: ");
            String name = scanner.nextLine();

            PreparedStatement ps = con.prepareStatement("INSERT INTO emp1 (id, name) VALUES (?, ?)");
            ps.setInt(1, id);
            ps.setString(2, name);

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new employee was inserted successfully!");
            }

            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
package com.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        System.out.println("Attempting to connect to the database...");

        Class.forName("org.postgresql.Driver");
        Connection con = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/SUNDARAM",
                "postgres",
                "12345"
        );

        System.out.println("Database connection successful!");
        return con;
    }
}
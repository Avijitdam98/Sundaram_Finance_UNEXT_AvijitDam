package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class StudentDAO{
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        System.out.println("Attempting to connect to the database...");

        Class.forName("oracle.jdbc.driver.OracleDriver");
//        Connection con = DriverManager.getConnection(
//                "jdbc:oracle:thin:@localhost:1521:XE",
//                "system",
//                "123456"
//        );
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
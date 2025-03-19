//
//package com.JDBC;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class Demo1 {
//    public static void main(String[] args) {
//        try {
//            System.out.println("Driver loaded");
//
//            Connection con = DbConnection.getConnection();
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Enter the ID of the employee: ");
//            int id = scanner.nextInt();
//
//            PreparedStatement ps=con.prepareStatement("select * from emp1 where id=?");
//            ps.setInt(1, id);
//            ResultSet rs=ps.executeQuery();
//
//            if (rs.next()) {
//                System.out.println("ID: " + rs.getInt(1) + ", Name: " + rs.getString(2) );
//            } else {
//                System.out.println("Employee not found.");
//            }
//
//            rs.close();
//            ps.close();
//            con.close();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}

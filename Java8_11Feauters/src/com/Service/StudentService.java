package com.Service;

import com.Model.Student;
import com.Connection.DbConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentService {

    public void insertStudents(List<Student> students) {
        try (Connection con = DbConnection.getConnection()) {
            String query = "INSERT INTO students (id, name, dob) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            for (Student student : students) {
                ps.setInt(1, student.getId());
                ps.setString(2, student.getName());
                ps.setDate(3, java.sql.Date.valueOf(student.getDob()));
                ps.addBatch();
            }

            int[] rowsInserted = ps.executeBatch();
            System.out.println(rowsInserted.length + " students were inserted successfully!");

            ps.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
package com.util;

import com.Model.Student;
import com.Service.StudentService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(100, "Avijit", LocalDate.of(2000, 1, 1)));
        students.add(new Student(102, "Abhishek", LocalDate.of(1999, 5, 15)));
        students.add(new Student(103, "Pritam", LocalDate.of(1998, 12, 9)));

        StudentService studentService = new StudentService();
        studentService.insertStudents(students);
    }
}
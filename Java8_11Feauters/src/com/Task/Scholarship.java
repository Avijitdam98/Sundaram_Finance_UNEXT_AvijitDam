package com.Task;

import java.util.ArrayList;

class Student {
    private String name;
    private String collegeName;
    private float percentage;
    private float scholarship;

    public Student(String name, String collegeName, float percentage) {
        this.name = name;
        this.collegeName = collegeName;
        this.percentage = percentage;
        this.scholarship = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public float getScholarship() {
        return scholarship;
    }

    public void setScholarship(float scholarship) {
        this.scholarship = scholarship;
    }
}

class Portal {
    private ArrayList<Student> studentList;

    public Portal() {
        this.studentList = new ArrayList<>();
    }

    public void assignScholarship() {
        for (Student student : studentList) {
            if (student.getPercentage() >= 91) {
                student.setScholarship(10000);
            } else if (student.getPercentage() >= 81) {
                student.setScholarship(5000);
            } else {
                student.setScholarship(0);
            }
        }
    }

    public float totalScholarship() {
        float total = 0;
        for (Student student : studentList) {
            total += student.getScholarship();
        }
        return total;
    }

    public String totalMaxScholarshipOfCollege() {
        String maxCollege = "";
        float maxScholarship = 0;
        for (Student student : studentList) {
            float collegeScholarship = 0;
            for (Student s : studentList) {
                if (s.getCollegeName().equals(student.getCollegeName())) {
                    collegeScholarship += s.getScholarship();
                }
            }
            if (collegeScholarship > maxScholarship) {
                maxScholarship = collegeScholarship;
                maxCollege = student.getCollegeName();
            }
        }
        return maxCollege;
    }

    public void addStudent(Student student) {
        this.studentList.add(student);
    }
}

public class Scholarship {
    public static void main(String[] args) {
        Portal obj = new Portal();
        obj.addStudent(new Student("Steve", "IIT", 89));
        obj.addStudent(new Student("Bob", "NIT", 94));
        obj.addStudent(new Student("Alice", "Abcd", 59));
        obj.assignScholarship();
        System.out.println(obj.totalScholarship());
        System.out.println(obj.totalMaxScholarshipOfCollege());
    }
}
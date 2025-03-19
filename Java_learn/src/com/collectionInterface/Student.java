package com.collectionInterface;

import java.util.Objects;

public class Student {
    @Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}

	String name;
    int rollNo;

    // Constructor inside the class
    
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

	@Override
	public int hashCode() {
		return Objects.hash(rollNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return rollNo == other.rollNo;
	}
    
    
    }
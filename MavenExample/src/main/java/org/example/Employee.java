package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
    int id;
    String name;
    @Autowired
    private Address adr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdr() {
        return adr;
    }
    @Autowired
    @Qualifier("adr2")

    public void setAdr(Address adr) {
        this.adr = adr;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", adr=" + adr + "]";
    }
}
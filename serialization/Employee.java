package com.day_03.serialization;
import java.io.*;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    // declare the attributes
    int id;
    String name;
    String department;
    double salary;

    // constructor for initialise the attributes of object
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override// method for display the details
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', department='" + department + "', salary=" + salary + "}";
    }
}
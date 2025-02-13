package com.day_02.Map.groupobjectsbyproperty;
import java.util.*;

class Employee {
    String name;
    String department;

    //constructor to initialise the attribute of object
    Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // getter method
    public String getDepartment() {
        return department;
    }

    // method for get the name
    public String getName() {
        return name;
    }
}
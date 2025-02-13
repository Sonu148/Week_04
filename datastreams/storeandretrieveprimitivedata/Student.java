package com.day_03.datastreams.storeandretrieveprimitivedata;
import java.io.*;

class Student {
    // initialise the rollnumber and name gpa
    int rollNumber;
    String name;
    double GPA;

    // constructor for initialise the attribute
    public Student(int rollNumber, String name, double GPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.GPA = GPA;
    }
}
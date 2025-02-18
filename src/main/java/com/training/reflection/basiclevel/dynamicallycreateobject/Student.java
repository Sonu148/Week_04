package com.training.reflection.basiclevel.dynamicallycreateobject;

public class Student {
    String name;

    // Constructor
    public Student(String name) {
        this.name = name;
    }

    // getter
    public String getName() {
        return name;
    }
    //method for display the name
    void display(){
        System.out.println("The ame of the student is: "+name);
    }
}

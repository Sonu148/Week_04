package com.training.reflection.basiclevel.accessprivatefield;

public class Person {
    // declare the age as final and private attribute
    final private  int age;

    // constructor for initialise the object attribute
    public Person(int age) {
        this.age = age;
    }

    // getter for age
    public int getAge() {
        return age;
    }

}

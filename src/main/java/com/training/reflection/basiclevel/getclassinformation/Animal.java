package com.training.reflection.basiclevel.getclassinformation;

// animal class
public class Animal {
    // declare the attribute of the animal
    private String name;
    private int age;

   // getter for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // constructor for the initialise the object
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // method for the sound
    public void sound(){
        System.out.println("Make a sound !");
    }
    // method for the eat operation
    public void eat(){
        System.out.println("Eating...");
    }

    // method for display the details
    public void display(String name, int age){
        System.out.println("The name of the animal is: "+name+" and age is:"+age);
    }
}

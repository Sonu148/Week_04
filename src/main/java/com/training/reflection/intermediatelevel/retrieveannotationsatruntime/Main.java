package com.training.reflection.intermediatelevel.retrieveannotationsatruntime;
public class Main {
    public static void main(String[] args) {
        // Get the class object for MyClass
        Class<MyClass> myClass = MyClass.class;

        // Check if the Author annotation is present
        if (myClass.isAnnotationPresent(Author.class)) {
            // Retrieve the Author annotation
            Author author = myClass.getAnnotation(Author.class);
            // Display the name attribute of the annotation
            System.out.println("Author Name: " + author.name());
        } else {
            System.out.println("Author annotation is not present.");
        }
    }
}
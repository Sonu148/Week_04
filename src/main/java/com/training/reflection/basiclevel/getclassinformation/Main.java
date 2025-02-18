package com.training.reflection.basiclevel.getclassinformation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static <T> void main(String[] args) {
        // creating the object of the Animal class
        Animal animal1 = new Animal("Cat", 12);
        System.out.println("The class name is :" + animal1.getClass().getSimpleName());

        // getting the field od animal class
        Field[] animalFields = animal1.getClass().getDeclaredFields();
        for (Field field : animalFields) {
            System.out.println("The fields: " + field.getName());
        }

        // getting the methods of class animal using reflection
        Method [] animalMethods = animal1.getClass().getDeclaredMethods();
        for (Method method : animalMethods){
            System.out.println("The methods: " + method.getName());
        }

        // getting the constructors of class animal using reflection
        Constructor<?> [] animalConstructor = animal1.getClass().getDeclaredConstructors();
        for (Constructor<?> constructor : animalConstructor) {
            System.out.println("The constructor: " + constructor.getName());
        }
    }
}
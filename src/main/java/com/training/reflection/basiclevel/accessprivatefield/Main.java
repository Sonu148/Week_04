package com.training.reflection.basiclevel.accessprivatefield;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws Exception{
        // initialise the person class object
        Person person= new Person(12);

        // display the declared age of the person
        System.out.println("The old age is "+ person.getAge());

        // Create a field class array to store and get field
        Field[] personField= person.getClass().getDeclaredFields();
        for(Field field: personField){
            if(field.getName().equals("age")){
                field.setAccessible(true);
                // setting the person age as 15
               field.set(person,15);
            }
        }
        // display the new age
        System.out.println("The updated age is "+ person.getAge());
    }
}

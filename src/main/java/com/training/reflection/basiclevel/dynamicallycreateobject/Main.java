package com.training.reflection.basiclevel.dynamicallycreateobject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // get the class object associated with student class
        Class<?> class1 = Student.class;

        //constructor of student class
        Constructor<?> constructor = class1.getConstructor(String.class);

        // create a student class object dynamically
        Student student1= (Student)constructor.newInstance("Aman");
        // display the name
        student1.display();
    }
}

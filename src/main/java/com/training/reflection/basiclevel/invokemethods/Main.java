package com.training.reflection.basiclevel.invokemethods;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {

        // create object of the calculator class
        Calculator calculator= new Calculator(2,4);

        // using reflection method class
        Method  method1= calculator.getClass().getDeclaredMethod("multiply", int.class, int.class);

            if(method1.getName().equals("multiply")){
                method1.setAccessible(true);
                method1.invoke(calculator, calculator.getA(),calculator.getB());
        }
    }
}

package com.training.reflection.intermediatelevel.dynamicmethodinvocation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        MathOperations mathOperations = new MathOperations();

            // invoking addition method dynamically
            Method addMethod= mathOperations.getClass().getDeclaredMethod("add", int.class, int.class);
            addMethod.invoke(mathOperations, 2, 3);

            // invoking subtract method dynamically
            Method subtractMethod= mathOperations.getClass().getDeclaredMethod("subtract", int.class, int.class);
            subtractMethod.invoke(mathOperations, 1, 3);

            // invoking multiply method dynamically
            Method mutilplyMethod= mathOperations.getClass().getDeclaredMethod("multiply", int.class, int.class);
            mutilplyMethod.invoke(mathOperations, 5, 3);
    }
}

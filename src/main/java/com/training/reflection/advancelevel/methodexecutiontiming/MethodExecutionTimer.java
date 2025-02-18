package com.training.reflection.advancelevel.methodexecutiontiming;
import java.lang.reflect.Method;

public class MethodExecutionTimer {
    public static void main(String[] args) throws Exception {
        SomeClass obj = new SomeClass();

        // Get the method
        Method method = SomeClass.class.getDeclaredMethod("someMethod");
        // Make the method accessible
        method.setAccessible(true);

        // Start the timer
        long startTime = System.nanoTime();
        // Invoke the method
        method.invoke(obj);
        // End the timer
        long endTime = System.nanoTime();

        System.out.println("Execution Time: " + (endTime - startTime) + " nanoseconds");
    }
}

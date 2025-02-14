package com.day_04;
public class ExceptionPropagationInMethods {

    public static void method1() throws ArithmeticException {
        // This will throw ArithmeticException
        int result = 10 / 0;
    }

    // method2() calls method1()
    public static void method2() throws ArithmeticException {
        method1();
    }

    public static void main(String[] args) {
        try {
            // Calls method2()
            method2();

        } catch (ArithmeticException e) {
            System.out.println("Handled exception in main");
        }
    }
}

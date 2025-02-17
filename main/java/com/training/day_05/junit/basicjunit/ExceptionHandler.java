package com.training.day_05.junit.basicjunit;

public class ExceptionHandler {
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Division result: " + divide(10, 2)); // 5

    }
}

package com.training.day_05.junit.basicjunit;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition: " + calc.add(5, 3));       // 8
        System.out.println("Subtraction: " + calc.subtract(10, 4)); // 6
        System.out.println("Multiplication: " + calc.multiply(6, 7)); // 42
        System.out.println("Division: " + calc.divide(20, 4));   // 5
    }
}

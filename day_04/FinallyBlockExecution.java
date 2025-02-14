package com.day_04;import java.util.Scanner;

public class FinallyBlockExecution {

    public static void main(String[] args) {
        // scanner class object to take input
        Scanner scanner = new Scanner(System.in);

        try {
            // taking the user numerator
            System.out.print("Enter the numerator: ");
            int numerator = scanner.nextInt();

            // taking denominator
            System.out.print("Enter the denominator: ");
            int denominator = scanner.nextInt();

            // calculating the result
            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        } finally {
            // it always execute
            System.out.println("Operation completed");
            scanner.close();
        }
    }
}

package com.day_04;
public class ThrowVsThrows {

    // Method to calculate interest
    public static double calculateInterest(double amount, double rate, int years) throws IllegalArgumentException {
        if (amount < 0 || rate < 0) {
            throw new IllegalArgumentException("Amount and rate must be positive");
        }
        // return the si after calculate it
        return (amount * rate * years) / 100;
    }

    public static void main(String[] args) {
        try {
            double amount = 1000;
            double rate = -5; // taking negative rate
            int years = 5;

            // method calling and storing in a double
            double interest = calculateInterest(amount, rate, years);
            System.out.println("Calculated interest: " + interest);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}

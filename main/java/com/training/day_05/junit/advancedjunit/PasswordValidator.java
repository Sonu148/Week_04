package com.training.day_05.junit.advancedjunit;

public class PasswordValidator {

    public static boolean isValidPassword(String password) {
        if (password == null || password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
            }
            if (Character.isDigit(ch)) {
                hasDigit = true;
            }
            if (hasUpperCase && hasDigit) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] passwords = {"StrongP@ss1", "weakpass", "NoDigitPass", "12345678", "Short1"};

        for (String password : passwords) {
            System.out.println("Password: " + password + " → " + (isValidPassword(password) ? "Valid" : "Invalid"));
        }
    }
}

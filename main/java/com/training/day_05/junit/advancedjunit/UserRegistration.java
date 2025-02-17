package com.training.day_05.junit.advancedjunit;

import java.util.regex.Pattern;

public class UserRegistration {

    private static final String EMAIL_REGEX = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-zA-Z]{2,}$";

    private static final String PASSWORD_REGEX = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

    public static String registerUser(String username, String email, String password) {
        if (username == null || username.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid username: Cannot be empty");
        }
        if (!Pattern.matches(EMAIL_REGEX, email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        if (!Pattern.matches(PASSWORD_REGEX, password)) {
            throw new IllegalArgumentException("Password must have at least 8 characters, one uppercase letter, and one digit");
        }
        return "User registered successfully";
    }

    public static void main(String[] args) {
        try {
            System.out.println(registerUser("JohnDoe", "john@example.com", "Password123"));
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

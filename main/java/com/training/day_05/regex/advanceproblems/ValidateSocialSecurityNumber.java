package com.training.day_05.regex.advanceproblems;
import java.util.regex.*;
public class ValidateSocialSecurityNumber {
    public static void main(String[] args) {
        String input = "123-45-6789"; // Example SSN

        // Regex for SSN validation
        String regex = "^\\d{3}-\\d{2}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println(input + " is valid.");
        } else {
            System.out.println(input + " is invalid.");
        }
    }
}

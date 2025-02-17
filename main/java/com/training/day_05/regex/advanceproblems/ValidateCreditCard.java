package com.training.day_05.regex.advanceproblems;
import java.util.regex.*;
public class ValidateCreditCard {
    public static void main(String[] args) {
        // Example card number
        String input = "4123456789012345";

        // Regex for Visa and MasterCard credit cards
        String regex = "^(4[0-9]{15}|5[1-5][0-9]{14})$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println(input + " is valid.");
        } else {
            System.out.println(input + " is invalid.");
        }
    }
}

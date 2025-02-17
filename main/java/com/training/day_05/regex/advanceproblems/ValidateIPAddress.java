package com.training.day_05.regex.advanceproblems;
import java.util.regex.*;

public class ValidateIPAddress {
    public static void main(String[] args) {
        String input = "192.168.1.1"; // Example IP address

        // Regex for validating an IPv4 address
        String regex = "^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println(input + " is valid.");
        } else {
            System.out.println(input + " is invalid.");
        }
    }
}

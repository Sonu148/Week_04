package com.training.day_05.regex.advanceproblems;
import java.util.regex.*;
public class ExtractCurrencyValuesFromText {
    public static void main(String[] args) {
        String input = "The price is $45.99, and the discount is 10.50.";

        // Regex to extract currency values
        String regex = "(\\$\\d+(\\.\\d{2})?|\\d+(\\.\\d{2})?)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Extract currency values
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

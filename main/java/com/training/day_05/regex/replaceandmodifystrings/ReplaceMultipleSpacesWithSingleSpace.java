package com.training.day_05.regex.replaceandmodifystrings;

public class ReplaceMultipleSpacesWithSingleSpace {
    public static void main(String[] args) {
        String input = "This is an    example  with multiple   spaces.";

        // Regex to replace multiple spaces with a single space
        String output = input.replaceAll("\\s+", " ");

        // Output the result
        System.out.println(output);
    }
}

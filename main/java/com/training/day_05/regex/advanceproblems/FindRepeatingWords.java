package com.training.day_05.regex.advanceproblems;
import java.util.regex.*;
public class FindRepeatingWords {
    public static void main(String[] args) {
        String input = "This is is a repeated repeated word test.";

        // Regex to find repeating words
        String regex = "\\b(\\w+)\\b(?=.*\\b\\1\\b)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Find and print repeating words
        while (matcher.find()) {
            System.out.println(matcher.group(1));
        }
    }
}

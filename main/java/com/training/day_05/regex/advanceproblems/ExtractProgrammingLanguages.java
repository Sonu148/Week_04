package com.training.day_05.regex.advanceproblems;
import java.util.regex.*;
public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        String input = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Regex to extract programming language names
        String regex = "\\b(Java|Python|JavaScript|Go)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        // Extract programming language names
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

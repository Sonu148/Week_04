package com.training.day_05.regex.extractionproblems;
import java.util.regex.*;
public class CapitalizedWordsfromSentence {

        public static void main(String[] args) {
            String text = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

            // Regex for capitalized words
            String regex = "\\b[A-Z][a-z]*\\b";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            // Extract all capitalized words
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
}

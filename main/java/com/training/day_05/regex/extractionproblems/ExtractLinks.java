package com.training.day_05.regex.extractionproblems;
import java.util.regex.*;
public class ExtractLinks {
    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Regex for URLs
        String regex = "https?://[a-zA-Z0-9.-]+(?:/[a-zA-Z0-9._%+-]*)?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Extract all links
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

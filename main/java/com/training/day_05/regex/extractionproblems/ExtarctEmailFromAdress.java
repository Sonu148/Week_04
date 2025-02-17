package com.training.day_05.regex.extractionproblems;
import java.util.regex.*;
public class ExtarctEmailFromAdress {

        public static void main(String[] args) {
            String text = "Contact us at support@example.com and info@company.org";

            // Regex for email addresses
            String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            // Extract all email addresses
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
    }


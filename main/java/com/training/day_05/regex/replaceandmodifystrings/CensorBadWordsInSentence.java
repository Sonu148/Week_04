package com.training.day_05.regex.replaceandmodifystrings;

public class CensorBadWordsInSentence {
    public static void main(String[] args) {
        String input = "This is a damn bad example with some stupid words.";

        // List of bad words
        String[] badWords = {"damn", "stupid"};

        // Loop through each bad word and replace it with ****
        for (String badWord : badWords) {
            input = input.replaceAll("(?i)\\b" + badWord + "\\b", "****");
        }

        // Output the result
        System.out.println(input);
    }
}

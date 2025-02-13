package com.day_03.countwordsinfile;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCount {
    public static void main(String[] args) {
        // file.txt file path
        String fileName = "src/main/java/com/day_03/countwordsinfile/file.txt";

        //creating the hashmap
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Read the file and count the words
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+"); // Split by non-word characters
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }

            // Convert the map to a list and sort by frequency
            List<Map.Entry<String, Integer>> wordList = new ArrayList<>(wordCountMap.entrySet());
            Collections.sort(wordList, (a, b) -> b.getValue() - a.getValue());

            // Print the top 5 words
            for (int i = 0; i < 5 && i < wordList.size(); i++) {
                System.out.println(wordList.get(i).getKey() + ": " + wordList.get(i).getValue());
            }

        } catch (IOException e) {
            // catching the exception
            e.printStackTrace();
        }
    }
}

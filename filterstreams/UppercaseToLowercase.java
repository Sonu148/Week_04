package com.day_03.filterstreams;

import java.io.*;

public class UppercaseToLowercase {

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/com/day_03/filterstreams/input.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/java/com/day_03/filterstreams/output.txt"))) {

            // initialise the string
            String line;
            // raed and write the file
            while ((line = reader.readLine()) != null) {
                writer.write(line.toLowerCase());
                writer.newLine();
            }

            // display the file txt
            System.out.println("Text converted to lowercase and saved to output.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

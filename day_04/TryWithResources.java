package com.day_04;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

        public static void main(String[] args) {
            // File path
            String fileName = "src/main/java/com/day_04/data.txt";

            // try with file reader to read the file
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

                String firstLine = br.readLine();

                // if first line is not empty
                if (firstLine != null) {
                     System.out.println("First line: " + firstLine);
                } else {
                    // if file is empty
                    System.out.println("File is empty.");
                }
            } catch (IOException e) {
                // when file not found
                System.out.println("error reading file");
            }
        }
    }

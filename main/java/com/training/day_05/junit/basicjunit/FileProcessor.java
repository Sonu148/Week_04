package com.training.day_05.junit.basicjunit;

import java.io.*;

public class FileProcessor {

    public static void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    public static String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString().trim(); // Trim to remove extra newline at the end
    }

    public static void main(String[] args) {
        String filename = "testfile.txt";
        String content = "Hello, File Handling in Java!";

        try {
            writeToFile(filename, content);
            System.out.println("File written successfully.");

            String readContent = readFromFile(filename);
            System.out.println("File Content: " + readContent);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

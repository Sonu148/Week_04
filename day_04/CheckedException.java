package com.day_04;
import java.io.*;

public class CheckedException {

        public static void main(String[] args) {
            // File path for data.txt
            String fileName = "src/main/java/com/day_04/data.txt";

            // using try and catch to check exception
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;

                // Read and print each line of the file
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found");
            } catch (IOException e) {
                System.out.println("error while reading file.");
            }
        }
}

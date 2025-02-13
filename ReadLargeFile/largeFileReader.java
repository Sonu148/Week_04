package com.day_03.ReadLargeFile;
import java.io.*;
import java.nio.file.*;
public class largeFileReader {

        public static void main(String[] args) {
            // path of the large file
            Path path = Paths.get("largeFile.txt");


            try (BufferedReader reader = Files.newBufferedReader(path)) {
                String line;// initialise the string
                while ((line = reader.readLine()) != null) {
                    // checking with condition
                    if (line.toLowerCase().contains("error")) {
                        System.out.println(line);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }



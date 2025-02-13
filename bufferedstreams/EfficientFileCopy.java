package com.day_03.bufferedstreams;

import java.io.*;

public class EfficientFileCopy {
    public static void main(String[] args) {
        // source file path
        String sourceFile = "src/main/java/com/day_03/bufferedstreams/largeFile.txt";
        String bufferedDestFile = "src/main/java/com/day_03/bufferedstreams/bufferedFileCopy.txt";
        String unbufferedDestFile = "src/main/java/com/day_03/bufferedstreams/unbufferedFileCopy.txt";

        // Measure and copy with Buffered Streams
        long startTime = System.nanoTime();
        copyWithBufferedStreams(sourceFile, bufferedDestFile);
        long bufferedTime = System.nanoTime() - startTime;

        // Measure and copy with Unbuffered Streams
        startTime = System.nanoTime();
        copyWithUnbufferedStreams(sourceFile, unbufferedDestFile);
        long unbufferedTime = System.nanoTime() - startTime;

        // Display results
        System.out.println("Buffered copy time: " + bufferedTime + " nanoseconds");
        System.out.println("Unbuffered copy time: " + unbufferedTime + " nanoseconds");

        // Compare times
        if (bufferedTime < unbufferedTime) {
            System.out.println("Buffered copy was faster.");
        } else {
            System.out.println("Unbuffered copy was faster.");
        }
    }

    // Method to copy file using Buffered Streams
    public static void copyWithBufferedStreams(String source, String destination) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destination))) {

            byte[] buffer = new byte[4096]; // Buffer size 4KB
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
            System.out.println("Buffered copy completed.");
        } catch (IOException e) {
            System.out.println("Error during buffered file copy: " + e.getMessage());
        }
    }

    // Method to copy file using Unbuffered Streams
    public static void copyWithUnbufferedStreams(String source, String destination) {
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(destination)) {

            int byteRead;
            while ((byteRead = fis.read()) != -1) {
                fos.write(byteRead);
            }
            System.out.println("Unbuffered copy completed.");
        } catch (IOException e) {
            System.out.println("Error during unbuffered file copy: " + e.getMessage());
        }
    }
}

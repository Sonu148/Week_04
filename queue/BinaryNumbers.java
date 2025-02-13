package com.day_02.queue;
import java.util.*;

public class BinaryNumbers {

    // Method to generate first N binary numbers using a queue
    public static List<String> generateBinaryNumbers(int N) {
        Queue<String> queue = new LinkedList<>();
        List<String> result = new ArrayList<>();

        // Start with "1"
        queue.add("1");

        // Loop to generate the first N binary numbers
        for (int i = 0; i < N; i++) {
            String current = queue.remove();
            // Add the current binary number to the result list
            result.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        List<String> binaryNumbers = generateBinaryNumbers(N);
        System.out.println(binaryNumbers);  // Output: [1, 10, 11, 100, 101]
    }
}

package com.day_02.queue;
import java.util.*;

public class ReverseQueue {

    // Method to reverse the queue using recursion
    public static void reverseQueue(Queue<Integer> queue) {
        if (queue.isEmpty()) {
            return;
        }
        // Remove the front element
        int front = queue.remove();
        // Recursively reverse the rest of the queue
        reverseQueue(queue);
        // Add the front element back to the queue
        queue.add(front);
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>(Arrays.asList(10, 20, 30));
        reverseQueue(queue);
        System.out.println(queue);  // Output: [30, 20, 10]
    }
}

package com.day_02.queue;
import java.util.*;

public class CircularBuffer {

    // Array to store the elements
    private int[] buffer;
    private int head;
    private int tail;
    private int size;
    private int capacity;

    // Constructor to initialize the buffer with a given capacity
    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }

    // Insert a new value into the buffer
    public void insert(int value) {
        if (size == capacity) {
            // Overwrite the oldest element
            head = (head + 1) % capacity;
        } else {
            size++;
        }
        buffer[tail] = value;
        tail = (tail + 1) % capacity;
    }

    public void printBuffer() {
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(head + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularBuffer buffer = new CircularBuffer(3);
        buffer.insert(1);
        buffer.insert(2);
        buffer.insert(3);
        buffer.printBuffer();  // Output: 1 2 3

        buffer.insert(4);
        buffer.printBuffer();  // Output: 2 3 4
    }
}

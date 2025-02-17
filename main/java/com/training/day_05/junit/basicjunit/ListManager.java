package com.training.day_05.junit.basicjunit;

import java.util.List;

public class ListManager {
    public static void addElement(List<Integer> list, int element) {
        list.add(element);
    }

    public static void removeElement(List<Integer> list, int element) {
        list.remove(Integer.valueOf(element)); // Removes by value, not index
    }

    public static int getSize(List<Integer> list) {
        return list.size();
    }

    public static void main(String[] args) {
        List<Integer> numbers = new java.util.ArrayList<>();

        addElement(numbers, 10);
        addElement(numbers, 20);
        System.out.println("List after adding: " + numbers); // [10, 20]

        removeElement(numbers, 10);
        System.out.println("List after removing 10: " + numbers); // [20]

        System.out.println("Size of list: " + getSize(numbers)); // 1
    }
}

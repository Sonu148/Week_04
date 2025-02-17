package com.training.day_05.junit.basicjunit;

public class NumberUtils {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        int[] testNumbers = {2, 4, 6, 7, 9};

        for (int num : testNumbers) {
            System.out.println("Is " + num + " even? " + isEven(num));
        }
    }
}

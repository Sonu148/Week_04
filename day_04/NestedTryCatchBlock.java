package com.day_04;
import java.util.Scanner;

public class NestedTryCatchBlock {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // taking the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // taking the index form user
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        try {
            try {
                // Access the array element
                int element = array[index];
                try {
                    int result = element / divisor;
                    System.out.println("result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("not divide by zero");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } finally {
            scanner.close();
        }
    }
}

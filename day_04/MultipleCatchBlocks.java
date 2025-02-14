package com.day_04;
import java.util.Scanner;

public class MultipleCatchBlocks {

        public static void main(String[] args) {
            //scanner object to take user input
            Scanner scanner = new Scanner(System.in);

            //take array size and the elements
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            // initialise the array with length size
            int[] array = new int[size];

            // display the elements
            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            // taking the index which we retrieve
            System.out.print("Enter the index to retrieve value: ");
            int index = scanner.nextInt();

            try {
                System.out.println("Value at index " + index + " is  " + array[index]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                // index out of range
                System.out.println("Invalid index");
            }
            catch (NullPointerException e) {
                // array is null
                System.out.println("Array is not initialise");
            }
            finally {

                scanner.close();
            }
        }
    }


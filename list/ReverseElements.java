package com.day_02.list;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class ReverseElements {
    public static void reverseAArray(List<Integer> arrayList) {
        int low = 0;
        int high = arrayList.size()-1;
        while (low < high) {
            int temp = arrayList.get(low);
            arrayList.set(low, arrayList.get(high));
            arrayList.set(high, temp);
            low ++;
            high --;
        }
    }

    public static void main(String[] args) {
        // creating the arraylist for elements
        List<Integer> elements = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("The elements before reversal are: " + elements);

        // Displaying the output
        reverseAArray(elements);
        System.out.println(elements);

        // creating the new linked list for storing the element
        LinkedList<Integer> elements2= new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("The elements before reversal are: "+ elements2 );

        // Displaying output
        reverseAArray(elements2);
        System.out.println(elements2);

    }
}

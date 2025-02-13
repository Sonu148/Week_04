package com.day_02.set;
import java.util.*;

public class Subset {
    public static void main(String[] args) {
        // Create set1 and set2
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Add elements to set1 and set2
        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        // Check if set1 is a subset of set2
        boolean isSubset = set2.containsAll(set1);

        // Output the result
        System.out.println("set1 is subset of set2 :" + isSubset);
    }
}

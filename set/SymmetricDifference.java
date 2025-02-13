package com.day_02.set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {

    // Method for finding symmetric difference
    public static void symmetricDifference(Set<Integer> set1, Set<Integer>set2){

        // creating the new set called difference
        Set<Integer> differnece= new HashSet<>(set1);
        // finding the unique elements from set1
        differnece.removeAll(set2);
        System.out.println(differnece);
    }
    public static void main(String[] args) {
        // Taking the set1 and set2
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(2,3,4));
        // method call
        symmetricDifference(set1,set2);
    }
}

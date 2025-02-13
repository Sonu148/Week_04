package com.day_02.set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckTwoSetsEqual {

    // method to compare the sets
    public static void compareSets(Set<Integer> set1, Set<Integer> set2){
        // checking the sets1 contain set2 or not
        if(set1.containsAll(set2)){
            System.out.println("True");
        }
        else System.out.println("False");
    }

    public static void main(String[] args) {
        // Creating and setting  the set1 and set2
        Set<Integer> set1= new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2= new HashSet<>(Arrays.asList(1,2,3,4,6));
        // method call
        compareSets(set1,set2);
    }
}

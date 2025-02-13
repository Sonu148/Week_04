package com.day_02.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnionIntersectionOfTwoSets {

    public static void unionIntersection(Set<Integer>set1, Set<Integer> set2){
        Set<Integer> union= new HashSet<>(set1);

        // finding the union of set1 and set2
        union.addAll(set2);

        // display the union of the sets
        System.out.println("The union of the sets "+union);
        Set<Integer> intersection= new HashSet<>(set1);

        // checking the common elements
        intersection.retainAll(set2);

        // display the intersection
        System.out.println("The intersection of the sets "+intersection);
    }

    public static void main(String[] args) {
        // Taking the set1 nad set2
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 3, 7, 9));

        // function calling for set1 amd set2
        unionIntersection(set1,set2);
    }
}

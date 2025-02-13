package com.day_02.set;

import java.util.*;

public class SetToSortedList {
    // method for the sorting the set into arraylist
    public static void setToSortedList(HashSet<Integer> set){
        // creating the list
        List<Integer> list= new ArrayList<>(set);
        // sort the list in ascending order
        Collections.sort(list);
        // display the sorted array list
        System.out.println("The sorted list is : "+ list);
    }

    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>(Arrays.asList(1,23,5,8,2,6));
        setToSortedList(set);
    }
}

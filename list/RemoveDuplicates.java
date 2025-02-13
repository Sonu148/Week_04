package com.day_02.list;
import java.util.ArrayList;

public class RemoveDuplicates {
    public static void removeDuplicates(int [] arr){
       ArrayList<Integer> array= new ArrayList<>();
        for(int a: arr){
            if(!array.contains(a)){
                array.addLast(a);
            }
        }
        System.out.println("The array is"+ array);
    }

    public static void main(String[] args) {
        int [] arr= {1,2,4,5,2,2,5,2,7,1,6,9,33};
        removeDuplicates(arr);
    }
}

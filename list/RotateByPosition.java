package com.day_02.list;
import java.util.ArrayList;
import java.util.Arrays;

public class RotateByPosition {

    public static void rotate(ArrayList<Integer> list, int position){

        for(int i=0; i<position; i++){
            list.addLast(list.remove(0));
        }
        System.out.println("The rotated list is"+ list);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(10,20,30,40,50));
        rotate(list,2);
    }
}

package com.day_02.list;
import java.util.Arrays;
import java.util.LinkedList;

public class FindElementInLinkedList {

    public static void findElement(LinkedList<Integer> list, int postion){

        System.out.println(list.get(list.indexOf(list.getLast())+1-postion));
    }

    public static void main(String[] args) {
       LinkedList<Integer> list= new LinkedList<>(Arrays.asList(10,20,30,50));
        findElement(list,2);
    }
}

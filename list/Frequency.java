package com.day_02.list;
import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void frequencyCount(String[] str){
        Map<String , Integer> items= new HashMap<>();

        int count=0;
        for (String s : str) {
            if (items.containsKey(s)) {
                items.put(s, items.get(s)+1);
            } else {
                items.put(s, 1);
            }
        }
        System.out.println("The items are "+items);
    }

    public static void main(String[] args) {
        String [] str={"Apple", "Banana", "Papaya", "Apple", "Banana", "Papaya","Apple", "Banana", "Papaya"};
        frequencyCount(str);
    }
}

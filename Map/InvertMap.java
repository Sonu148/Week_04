package com.day_02.Map;import java.util.*;

public class InvertMap {
    public static void main(String[] args) {
        // use the map interface
        Map<String, Integer> original = Map.of("A", 1, "B", 2, "C", 1);
        Map<Integer, List<String>> inverted = new HashMap<>();

        // looping
        for (Map.Entry<String, Integer> entry : original.entrySet()) {
            inverted.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
        }

        // Output: {1=[A, C], 2=[B]}
        System.out.println(inverted);
    }
}

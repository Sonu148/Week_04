package com.day_02.Map;
import java.util.*;

public class MergeMaps {
    public static void main(String[] args) {
        // create two maps.
        Map<String, Integer> map1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> map2 = Map.of("B", 3, "C", 4);

        // merge the maps
        Map<String, Integer> merged = new HashMap<>(map1);
        map2.forEach((key, value) -> merged.merge(key, value, Integer::sum));

        // display the merge map
        System.out.println(merged);  // Output: {A=1, B=5, C=4}
    }
}

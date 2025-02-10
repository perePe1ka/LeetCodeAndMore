package org.example.LeetCode;

import java.util.*;

public class SolutionLeetCode_SingleNumber_136 {
    public int singleNumber(int[] nums) {
        Set set = new HashSet();
        for (int num : nums) {
            if (set.contains(num)) {
                set.remove(num);
            } else {
                set.add(num);
            }
        }

        System.out.println(set.iterator().next());
        return (int) set.iterator().next();
    }
}
package org.example.LeetCode;

import java.util.Arrays;

public class SolutionLeetCode_SquaresOfASortedArray_977 {
    public int[] sortedSquares(int[] nums) {
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = (int) Math.pow(nums[i], 2);
        }

        return Arrays.stream(a).sorted().toArray();
    }
}
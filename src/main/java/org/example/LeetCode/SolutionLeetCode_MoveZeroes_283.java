package org.example.LeetCode;

import java.util.Arrays;

public class SolutionLeetCode_MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        int swap = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if (i != swap) {
                    int transferInt = nums[swap];
                    nums[swap] = nums[i];
                    nums[i] = transferInt;
                }
                swap++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
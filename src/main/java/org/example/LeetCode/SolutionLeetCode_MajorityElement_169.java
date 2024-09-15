package org.example.LeetCode;

import java.util.Arrays;

public class SolutionLeetCode_MajorityElement_169 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}
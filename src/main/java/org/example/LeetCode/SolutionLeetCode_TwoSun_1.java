package org.example.LeetCode;

public class SolutionLeetCode_TwoSun_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] a = new int[2];
        for(int i = 1; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if(nums[i] + nums[j] == target && i != j) {
                    a[0] = j;
                    a[1] = i;
                    break;
                } 
            } 
        }
        return a;
    }
}
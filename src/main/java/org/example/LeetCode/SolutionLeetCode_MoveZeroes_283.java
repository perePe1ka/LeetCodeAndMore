package org.example.LeetCode;

public class SolutionLeetCode_MoveZeroes_283 {
    public void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length - 1; j++) {
                if(nums[j] == 0) {
                int temp = 0;
                temp += nums[j];
                nums[j] = nums[j+1];
                nums[j+1] = temp;
                temp = 0;
            }
            }
        }
    }
}
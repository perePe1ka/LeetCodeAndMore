package org.example.LeetCode;

public class SolutionLeetCode_BinarySearch_704 {
    public int search(int[] nums, int target) {
        if(nums.length == 0) {
            return -1;
        } else if(nums.length == 1 && nums[0] == target) {
            return 0;
        }

        if(nums[nums.length/2] > target) {
            for(int i = 0; i < nums.length/2; i++) {
                if(nums[i] == target) {
                    return i;
                } 
            }
        } else {
            for(int i = nums.length - 1; i >= nums.length/2; i--) {
                if(nums[i] == target) {
                    return i;
                }
            }
        }
        return -1;
    }
}
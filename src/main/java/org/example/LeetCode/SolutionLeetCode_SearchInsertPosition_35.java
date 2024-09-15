package org.example.LeetCode;

public class SolutionLeetCode_SearchInsertPosition_35 {
    public int searchInsert(int[] nums, int target) {
        int output = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target ==  nums[i]) {
                output += i;
                break;
            } else {
                if (target < nums[i]) {
                    output += i;
                    break;
                }
                else if (target > nums[nums.length-1]){
                    output = nums.length;
                }
            }
        }
        return output;
    }
}
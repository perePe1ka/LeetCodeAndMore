package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.moveZeroes(new int[]{0,1,0,3,12});
    }
}

class Solution {
    public void moveZeroes(int[] nums) {
        int[] nums2 = new int[nums.length];

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums2[i] = nums[i];
            }
        }
    }
}
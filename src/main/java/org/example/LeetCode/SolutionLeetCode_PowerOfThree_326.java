package org.example.LeetCode;

public class SolutionLeetCode_PowerOfThree_326 {
    public boolean isPowerOfThree(int n) {
        for (int i = 0; i < 20; i++) {
            if (Math.pow(3,i) == n) {
                return true;
            }
        }
        return false;
    }
}
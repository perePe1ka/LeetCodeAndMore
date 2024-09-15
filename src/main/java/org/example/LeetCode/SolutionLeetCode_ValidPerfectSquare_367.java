package org.example.LeetCode;

public class SolutionLeetCode_ValidPerfectSquare_367 {
    public boolean isPerfectSquare(int num) {
        int test = (int) Math.pow(num, 0.5);
        if (Math.pow(test,2) == num) {
            return true;
        }
        return false;
    }
}
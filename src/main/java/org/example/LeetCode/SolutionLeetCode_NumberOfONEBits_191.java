package org.example.LeetCode;

public class SolutionLeetCode_NumberOfONEBits_191 {
    public int hammingWeight(int n) {
        int output = 0;
        while (n != 0) {
            if (n%2 == 1) {
                output++;
            }
            n /= 2;
        }
        return output;
    }
}
package org.example.LeetCode;

public class SolutionLeetCode_ReverseString_344 {
    public void reverseString(char[] s) {
        char[] s1 = new char[s.length];
        for (int i = s.length - 1; i >= 0; i--) {
            s1[s.length - 1 - i] = s[i];
        }
        for (int i = 0; i < s.length; i++) {
            s[i] = s1[i];
        }
    }
}
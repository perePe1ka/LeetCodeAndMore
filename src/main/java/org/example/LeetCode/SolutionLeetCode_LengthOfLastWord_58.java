package org.example.LeetCode;

class SolutionLeetCode_LengthOfLastWord_58 {
    public int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        int test = s1.length - 1;
        int count = s1[test].length();

        return count;
    }
}
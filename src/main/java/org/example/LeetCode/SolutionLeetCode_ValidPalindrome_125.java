package org.example.LeetCode;

class SolutionLeetCode_ValidPalindrome_125 {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        if (s.equals(new StringBuilder(s).reverse().toString())) return true;

        return false;
    }
}
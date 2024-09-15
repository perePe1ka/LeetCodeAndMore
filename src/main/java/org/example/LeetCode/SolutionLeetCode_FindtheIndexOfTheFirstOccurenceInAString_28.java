package org.example.LeetCode;

public class SolutionLeetCode_FindtheIndexOfTheFirstOccurenceInAString_28 {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }

        if (haystack.equals(needle)) {
            return 0;
        }

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }

    }
}
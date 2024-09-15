package org.example.LeetCode;

public class SolutionLeetCode_ElementAppearingMoreThan25_1287 {
    public int findSpecialInteger(int[] arr) {
        int length = arr.length;
        int targetFrequency = length / 4;

        for (int i = 0; i < length - targetFrequency; i++) {
            if (arr[i] == arr[i + targetFrequency]) {
                return arr[i];
            }
        }


        return -1;

    }
}
package org.example.LeetCode;

import java.util.Arrays;

public class SolutionLeetCode_MergeSortedArray_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        int[] lastArray = new int[m+n];
        int count = 0;

        int[] newNums1 = new int[m];
        int[] newNums2 = new int[n];

        for (int i = 0; i < m; i++) {
            newNums1[i] = nums1[i];
        }
        for (int i = 0; i < n; i++) {
            newNums2[i] = nums2[i];
        }

        for (int i = 0; i < newNums1.length; i++) {
            lastArray[i] = newNums1[i];
            count++;
        }
        for (int i = 0; i < newNums2.length; i++) {
            lastArray[count++] = newNums2[i];
        }

        lastArray = Arrays.stream(lastArray).sorted().toArray();

        nums1 = new int[m+n];
        nums1 = lastArray;

        for (int values : nums1) {
            System.out.print(values + " ");
        }

    }
}
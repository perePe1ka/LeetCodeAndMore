package org.example.SomePrograms;

public class BubbleSort {
    public int[] getSorterdArray(int[] array) {
        int length = array.length;
        int n;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j+1]) {
                    n = array[j+1];
                    array[j+1] = array[j];
                    array[j] = n;

                }
            }
        }
        for (int nums: array) {
            System.out.print(nums + " ");
        }
        return array;
    }
}
package org.example.LeetCode;

//class Solution {
//    public int fib(int n) {
//        int a = 0;
//        int b = 1;
//        if (n == 0) {
//            return 0;
//        } else if (n == 1 || n == 2) {
//            return 1;
//        }
//
//        return fib(n - 1) + fib(n - 2);
//    }
//}

public class SolutionLeetCode_FibbonacciNumber_509 {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }
        int temp = 0;
        for (int i = 0; i < n - 1; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return temp;
    }
}
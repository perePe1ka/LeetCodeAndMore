package org.example.LeetCode;

import java.util.HashSet;
import java.util.Set;

public class SolutionLeetCode_HappyNumber_202 {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();

        while (n != 1 && !set.contains(n)){
            set.add(n);
            n = getNextNum(n);
        }
        return n == 1;
    }


    public int getNextNum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
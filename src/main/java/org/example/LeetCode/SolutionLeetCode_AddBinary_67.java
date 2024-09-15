package org.example.LeetCode;

public class SolutionLeetCode_AddBinary_67 {
    public String addBinary(String a, String b) {
        String a1 = String.valueOf(Long.parseLong(a, 2));
        String b1 = String.valueOf(Long.parseLong(b, 2));
        long summ1 = Long.parseLong(a1) + Long.parseLong(b1);
        String summ2 = String.valueOf(Long.toBinaryString(summ1));
        return summ2;
    }
}
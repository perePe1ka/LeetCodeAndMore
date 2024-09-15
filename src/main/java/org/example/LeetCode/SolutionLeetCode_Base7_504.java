package org.example.LeetCode;

public class SolutionLeetCode_Base7_504 {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }

        int test = num;
        if (num < 0) {
            num -= 2 * num;
        }

        String s = "";
        while (num != 0) {
            s += num % 7;
            num /= 7;
        }
        if (test < 0) {
            s += "-";
        }
        String s1 = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s1 += s.charAt(i);
        }

        return s1;
    }
}


//class Solution {
//    public String convertToBase7(int num) {
//        int test = num;
//        if (num < 0) {
//            num -= 2 * num;
//        }
//
//        if (num == 0) {
//            return "0";
//        }
//
//        StringBuilder stringBuilder = new StringBuilder();
//        String s = "";
//        while (num != 0) {
//            stringBuilder.append(num % 7);
//            num /= 7;
//        }
//        stringBuilder.reverse();
//        if (test < 0) {
//            s += "-" + stringBuilder.toString();
//        } else {
//            s += stringBuilder.toString();
//        }
//
//        return s;
//    }
//}
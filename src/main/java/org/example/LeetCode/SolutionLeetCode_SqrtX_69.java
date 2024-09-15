package org.example.LeetCode;

public class SolutionLeetCode_SqrtX_69 {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }

        double num = x;
        double t;
        double squareroot = num / 2;
        do
        {
            t = squareroot;
            squareroot = (t + (num / t)) / 2;
        }
        while ((t - squareroot) != 0);

        x = (int) squareroot;

        return x;
    }
}
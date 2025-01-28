package org.example.Yandex;

import java.util.Scanner;

public class CorrectSequence {
    static final int MOD = 1000000007;

    static int pairsPossible(char c1, char c2) {
        if (c1 != '?' && c2 != '?') {
            if (c1 == '(' && c2 == ')') return 1;
            if (c1 == '[' && c2 == ']') return 1;
            if (c1 == '{' && c2 == '}') return 1;
            return 0;
        }

        if (c1 == '?' && c2 != '?') {
            if (c2 == ')') return 1;
            if (c2 == ']') return 1;
            if (c2 == '}') return 1;
            return 0;
        }
        if (c1 != '?' && c2 == '?') {
            if (c1 == '(') return 1;
            if (c1 == '[') return 1;
            if (c1 == '{') return 1;
            return 0;
        }
        return 3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

        char[] arr = new char[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i] = s.charAt(i-1);
        }

        long[][] dp = new long[N+1][N+1];

        for (int length = 2; length <= N; length++) {
            for (int i = 1; i + length - 1 <= N; i++) {
                int j = i + length - 1;
                if (((j - i + 1) % 2) != 0) {
                    dp[i][j] = 0;
                    continue;
                }

                long ways = 0;
                for (int k = i+1; k <= j; k += 2) {
                    int waysPair = pairsPossible(arr[i], arr[k]);
                    if (waysPair == 0) {
                        continue;
                    }
                    long leftWays = 1;
                    if (i+1 <= k-1) {
                        leftWays = dp[i+1][k-1];
                    }
                    long rightWays = 1;
                    if (k+1 <= j) {
                        rightWays = dp[k+1][j];
                    }
                    long current = (leftWays % MOD) * (rightWays % MOD) % MOD;
                    current = (current * waysPair) % MOD;
                    ways = (ways + current) % MOD;
                }
                dp[i][j] = ways;
            }
        }

        System.out.println(dp[1][N] % MOD);
    }
}


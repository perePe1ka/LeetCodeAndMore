package org.example.Yandex;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MediansAndSubsegments {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B = in.nextInt();

        int[] A = new int[N+1];
        for (int i = 1; i <= N; i++) {
            A[i] = in.nextInt();
        }

        int idx = 1;
        for (int i = 1; i <= N; i++) {
            if (A[i] == B) {
                idx = i;
                break;
            }
        }

        int[] a = new int[N+1];
        for (int i = 1; i <= N; i++) {
            if (A[i] > B) {
                a[i] = 1;
            } else if (A[i] < B) {
                a[i] = -1;
            } else {
                a[i] = 0;
            }
        }

        int[] P = new int[N+1];
        for (int i = 1; i <= N; i++) {
            P[i] = P[i-1] + a[i];
        }

        Map<Long, Integer>[] leftMap = new Map[2];
        Map<Long, Integer>[] rightMap = new Map[2];

        leftMap[0] = new HashMap<>();
        leftMap[1] = new HashMap<>();
        rightMap[0] = new HashMap<>();
        rightMap[1] = new HashMap<>();

        for (int x = 0; x < idx; x++) {
            long val = P[x];
            int parity = x % 2;
            leftMap[parity].put(val, leftMap[parity].getOrDefault(val, 0) + 1);
        }

        for (int y = idx; y <= N; y++) {
            long val = P[y];
            int parity = y % 2;
            rightMap[parity].put(val, rightMap[parity].getOrDefault(val, 0) + 1);
        }

        long answer = 0;
        for (int p = 0; p <= 1; p++) {
            int q = 1 - p;
            for (Map.Entry<Long, Integer> entry : leftMap[p].entrySet()) {
                long prefixValue = entry.getKey();
                int countLeft = entry.getValue();

                int countRight = rightMap[q].getOrDefault(prefixValue, 0);

                answer += (long)countLeft * countRight;
            }
        }

        System.out.println(answer);
    }
}

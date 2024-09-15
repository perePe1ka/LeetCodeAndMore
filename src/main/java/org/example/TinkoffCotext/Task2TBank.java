package org.example.TinkoffCotext;

import java.util.*;
public class Task2TBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] out = new int[n];
        out[0] = a[0];
        int currentSum = a[0];
        boolean valid = true;
        for (int i = 1; i < n; i++) {
            if (a[i] == -1) {
                if (i + 1 == n) {
                    out[i] = out[i - 1] + 1;
                    a[i] = a[i - 1] + out[i];
                    break;
                }
                out[i] = a[i + 1] - currentSum - a[i - 1];
                a[i] = a[i + 1] - currentSum;
                if (a[i] < a[i - 1]) {
                    valid = false;
                    break;
                }
            } else {
                out[i] = a[i] - a[i - 1];
            }
            currentSum += a[i];
        }
        if (valid) {
            System.out.println("YES");
            for (int i = 0; i < n; i++) {
                System.out.print(out[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("NO");
        }
        scanner.close();
    }
}
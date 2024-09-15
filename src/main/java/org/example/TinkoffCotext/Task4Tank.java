package org.example.TinkoffCotext;

import java.util.Scanner;
public class Task4Tank {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int getDivCount(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count;
    }
    public static boolean isComposite(int n) {
        return n > 1 && !isPrime(n);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int result = 0;
        for (int i = l; i <= r; i++) {
            if (isComposite(i)) {
                int divisorsCount = getDivCount(i);
                if (isPrime(divisorsCount)) {
                    result++;
                }
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
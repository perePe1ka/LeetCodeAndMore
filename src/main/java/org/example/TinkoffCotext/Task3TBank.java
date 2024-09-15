package org.example.TinkoffCotext;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Task3TBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String required = scanner.nextLine();
        int k = scanner.nextInt();
        Set<Character> requiredSet = new HashSet<>();
        for (char ch : required.toCharArray()) {
            requiredSet.add(ch);
        }
        int n = s.length();
        int bestStart = -1;
        int start = 0;
        Map<Character, Integer> counts = new HashMap<>();
        int matched = 0;
        for (int end = 0; end < n; end++) {
            char ch = s.charAt(end);
            if (requiredSet.contains(ch)) {
                counts.put(ch, counts.getOrDefault(ch, 0) + 1);
                if (counts.get(ch) == 1) {
                    matched++;
                }
            }
            while (matched == requiredSet.size() && start <= end) {
                if (end - start + 1 <= k) {
                    if (end - start + 1 < k || (end - start + 1 == k && start > bestStart)) {
                        bestStart = start;
                    }
                }
                char startCh = s.charAt(start);
                if (requiredSet.contains(startCh)) {
                    counts.put(startCh, counts.get(startCh) - 1);
                    if (counts.get(startCh) == 0) {
                        matched--;
                    }
                }
                start++;
            }
        }
        if (bestStart == -1) {
            System.out.println(-1);
        } else {
            System.out.println(s.substring(bestStart, bestStart + k));
        }
        scanner.close();
    }
}
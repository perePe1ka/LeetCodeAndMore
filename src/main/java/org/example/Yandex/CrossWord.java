package org.example.Yandex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrossWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();

        String[] grid = new String[R];
        for (int i = 0; i < R; i++) {
            grid[i] = sc.nextLine();
        }

        List<String> candidates = new ArrayList<>();

        for (int r = 0; r < R; r++) {
            String[] parts = grid[r].split("#");
            for (String word : parts) {
                if (word.length() >= 2) {
                    candidates.add(word);
                }
            }
        }

        for (int c = 0; c < C; c++) {
            StringBuilder sb = new StringBuilder();
            for (int r = 0; r < R; r++) {
                sb.append(grid[r].charAt(c));
            }
            String[] parts = sb.toString().split("#");
            for (String word : parts) {
                if (word.length() >= 2) {
                    candidates.add(word);
                }
            }
        }

        String answer = candidates.get(0);
        for (int i = 1; i < candidates.size(); i++) {
            if (candidates.get(i).compareTo(answer) < 0) {
                answer = candidates.get(i);
            }
        }

        System.out.println(answer);
    }
}

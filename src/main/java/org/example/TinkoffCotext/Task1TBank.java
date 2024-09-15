package org.example.TinkoffCotext;

import java.util.Scanner;
public class Task1TBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        for (String part : parts) {
            if (!part.contains("-")) {
                try {
                    int val = Integer.parseInt(part);
                    System.out.print(val + " ");
                } catch (NumberFormatException e) {
                    System.out.println("parse err");
                }
            } else {
                String[] twoVals = part.split("-");
                try {
                    int val1 = Integer.parseInt(twoVals[0]);
                    int val2 = Integer.parseInt(twoVals[1]);
                    for (int i = val1; i <= val2; i++) {
                        System.out.print(i + " ");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("parse err");
                }
            }
        }
        scanner.close();
    }
}
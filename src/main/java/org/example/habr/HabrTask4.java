package org.example.habr;

public class HabrTask4 {
    public int output(int num) {
        if (num < 10) {
            return num;
        } else {
            System.out.print(num % 10 + " ");
            return output(num / 10);
        }
    }
}
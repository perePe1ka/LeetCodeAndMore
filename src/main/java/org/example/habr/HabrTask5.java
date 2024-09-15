package org.example.habr;

public class HabrTask5 {
    public int output(int num) {
        if (num < 10) {
            return num;
        } else {
            return num % 10 + output(num / 10);
        }

    }
}
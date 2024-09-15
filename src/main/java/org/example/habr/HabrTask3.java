package org.example.habr;

public class HabrTask3 {
    public int output(double num) {
        if (num == 1) {
            return 1;
        } else if (num > 1 && num < 2) {
            return 0;
        } else {
            return output(num / 2);
        }

    }
}
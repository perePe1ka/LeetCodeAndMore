package org.example.habr;

public class HabrTask1 {
    public String output(Integer num) {
        if (num <= 1) {
            return num.toString();
        }

        return output(num - 1) + " " + num;
    }
}
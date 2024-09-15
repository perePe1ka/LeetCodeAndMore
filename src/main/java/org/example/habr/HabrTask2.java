package org.example.habr;

public class HabrTask2 {
    public String output(Integer num1, Integer num2) {
        if (num1 == num2) {
            return num1.toString();
        }
        if (num1 < num2) {
            return num1 + " " + output(num1 + 1, num2);
        } else {
            return num1 + " " + output(num1 - 1, num2);
        }

    }
}
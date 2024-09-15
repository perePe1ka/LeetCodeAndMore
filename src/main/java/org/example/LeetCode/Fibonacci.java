package org.example.LeetCode;

class Fibonacci {
    public int find_fibonacci(int num) {
        if (num <= 1) {
            return num;
        }

        return find_fibonacci(num - 1) + find_fibonacci(num - 2);

    }
}

class Fib {
    public int getFib(int num) {
        int a = 0;
        int b = 1;
        int temp = 0;
        for (int i = 0; i < num; i++) {
            temp = b;
            b += a;
            a = temp;
        }
        return b;
    }
}

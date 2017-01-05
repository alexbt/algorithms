package com.alexbt.algos.fibonacci;

public class RecursiveFibonacci {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fib(i));
        }
    }

    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a positive number");
        }
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}

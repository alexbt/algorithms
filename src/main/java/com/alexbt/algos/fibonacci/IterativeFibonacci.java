package com.alexbt.algos.fibonacci;

public class IterativeFibonacci {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(iterative(i));
        }
    }

    public static int iterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be a positive number");
        }
        if (n == 0) {
            return 0;
        }
        int first = 0;
        int second = 1;

        for (int i = 1; i < n; i++) {
            int tmp = first + second;
            first = second;
            second = tmp;
        }
        return second;
    }

}

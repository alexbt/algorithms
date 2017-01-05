package com.alexbt.algos.math;

public class Prime {

    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(30));
        System.out.println(isPrime(1));
    }

    private static boolean isPrime(int no) {

        int sqrt = (int) Math.sqrt(no);
        boolean result = no == 1 ? false : true;

        for (float i = 2; i <= sqrt; i++) {
            float div = no / i;
            if (div == (int) div) {
                result = false;
            }
        }

        return result;
    }
}

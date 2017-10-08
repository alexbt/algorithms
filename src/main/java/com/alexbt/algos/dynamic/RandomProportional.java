package com.alexbt.algos.dynamic;

import java.util.Random;

public class RandomProportional {
    private static final Random random = new Random();

    public static int getNumber(int[] array) {
        int chosen = 0;
        int sum = 0;

        for (int no : array) {
            sum += no;
            if (random.nextInt(sum) < no) {
                chosen = no;
            }
        }
        return chosen;
    }

    public static int getNumber2(int[] array) {
        Random random = new Random();
        int sum = 0;
        int chosen = 0;

        for (int no : array) {
            sum += no;
            if ((random.nextDouble() * sum + 1) < no) {
                chosen = no;
            }
        }
        return chosen;
    }

    public static void main(String[] args) {
        int[] array = new int[]{4, 7, 2, 12, 20};
        System.out.println(getNumber(array));
    }
}

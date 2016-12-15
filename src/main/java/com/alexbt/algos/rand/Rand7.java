package com.alexbt.algos.rand;

import java.util.Random;

public class Rand7 {

    public static int rand7() {
        int val = 25;
        while (val >= 21) {
            val = rand5() * 5 + rand5(); // [0, 5, 10, 15, 20] + [0,1,2,3,4] = number between 0 and 24
        }
        return val % 7;
    }

    public static void main(String[] arg) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(5 * i + j);
            }
        }
    }

    private static int rand5() {
        Random random = new Random();
        return random.nextInt(5);
    }
}

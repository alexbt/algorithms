package com.alexbt.algos.dynamic;

public class Coins {

    public static void main(String[] args) {
        // System.out.println(makeChange(new int[] { 1, 2, 4 }, 4));
        System.out.println(nbWaysForChange(new int[]{2, 3, 5, 6}, 10));
    }

    private static int nbWaysForChange(int[] coins, int totalToReach) {
        int[] preCalculated = new int[totalToReach + 1];

        preCalculated[0] = 1;

        for (int coin : coins) {
            for (int i = coin; i < preCalculated.length; i++) {
                preCalculated[i] += preCalculated[i - coin];
            }
        }

        return preCalculated[preCalculated.length - 1];
    }
}

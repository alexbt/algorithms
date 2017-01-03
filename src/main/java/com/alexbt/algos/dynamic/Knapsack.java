package com.alexbt.algos.dynamic;

public class Knapsack {

    // A utility function that returns maximum of two integers
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    // Returns the maximum value that can be put in a knapsack of capacity W
    static int knapSack(int maxWeight, int[] weight, int[] values) {
        int i, w;
        int K[][] = new int[values.length + 1][maxWeight + 1];

        // Build table K[][] in bottom up manner
        for (i = 0; i <= values.length; i++) {
            for (w = 0; w <= maxWeight; w++) {
                if (i == 0 || w == 0)
                    K[i][w] = 0;
                else if (weight[i - 1] <= w)
                    K[i][w] = max(values[i - 1] + K[i - 1][w - weight[i - 1]], K[i - 1][w]);
                else
                    K[i][w] = K[i - 1][w];
            }
        }

        return K[values.length][maxWeight];
    }

    // Driver program to test above function
    public static void main(String args[]) {
        int values[] = new int[] { 20, 30, 40,10 };
        int weight[] = new int[] { 2, 3, 4,6 };
        int maxWeight = 6;
        System.out.println(knapSack(maxWeight, weight, values));
    }

}

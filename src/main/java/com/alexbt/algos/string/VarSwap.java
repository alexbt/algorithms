package com.alexbt.algos.string;

public class VarSwap {

    public static int[] swap(int var1, int var2) {
        System.out.print("1: " + var1 + ", ");
        System.out.println("2: " + var2);

        var1 += var2;
        var2 = var1 - var2;
        var1 = var1 - var2;

        System.out.print("1: " + var1 + ", ");
        System.out.println("2: " + var2);

        return new int[]{var1, var2};
    }

    public static int[] swapXor(int var1, int var2) {
        System.out.print("1: " + Integer.toString(var1, 2) + ", ");
        System.out.println("2: " + Integer.toString(var2, 2));
        System.out.println("2: " + Integer.toString(var1 ^ var2, 2));

        var1 = var1 ^ var2;
        var2 = var1 ^ var2;
        var1 = var1 ^ var2;

        System.out.print("1: " + Integer.toString(var1, 2) + ", ");
        System.out.println("2: " + Integer.toString(var2, 2));
        return new int[]{var1, var2};
    }
}

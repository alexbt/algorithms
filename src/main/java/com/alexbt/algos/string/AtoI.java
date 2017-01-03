package com.alexbt.algos.string;

public class AtoI {

    public static void main(String[] args) {
        System.out.println(atoi("12345"));
    }

    private static long atoi(String str) {
        long no = 0;
        for (char car : str.toCharArray()) {
            no *= 10;
            no += (car - 48);
        }

        return no;
    }
}

package com.alexbt.algos.string;

public class AtoI {

    public static void main(String[] args) {
        System.out.println(atoi("12345"));
    }

    private static long atoi(String str) {
        System.out.println("1st: " + str.substring(0, 0));
        System.out.println(str.substring(0, 1));
        System.out.println(str.substring(1, 2));
        System.out.println(str.substring(2));
        long no = 0;
        for (char car : str.toCharArray()) {
            no *= 10;
            no += (car - 48);
        }

        return no;
    }
}

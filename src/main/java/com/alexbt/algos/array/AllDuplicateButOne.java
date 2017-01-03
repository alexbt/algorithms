package com.alexbt.algos.array;

import java.util.HashSet;
import java.util.Set;

public class AllDuplicateButOne {

    public static void main(String[] args) {
        int[] array = new int[] { 1, 3, 4, 7, 3, 1, 4 };
        System.out.println(findSingleItem(array));
        System.out.println(findSingleItem2(array));
    }

    private static int findSingleItem(int[] array) {
        int xor = 0;
        for (int no : array) {
            xor ^= no;
        }
        return xor;
    }

    private static int findSingleItem2(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int no : array) {
            if (set.contains(no)) {
                set.remove(no);
            } else {
                set.add(no);
            }
        }
        return set.iterator().next();
    }
}

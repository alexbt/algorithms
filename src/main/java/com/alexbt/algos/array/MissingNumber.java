package com.alexbt.algos.array;

public class MissingNumber {

    public static int findFromUnorderedArray(int[] unorderedArray) {
        int max = unorderedArray.length;
        int sum = 0;
        for (int no : unorderedArray) {
            sum += no;
        }
        return (max * (max + 1) / 2) - sum;
    }

    public static int findFromOrderedArray(int[] array, int no) {
        int min = 0;
        int max = array.length - 1;
        int current = 0;
        while (current != min && current != max) {
            current = (max - min) / 2;
            if (array[current] == no) {
                return current;
            }
        }
        return -1;
    }

    public static int findMissingFromOrderedArray(int[] array, int no) {
        int min = 0;
        int max = array.length - 1;
        int current = 0;
        while (current != min && current != max) {
            current = (max - min) / 2;
            if (array[current] == no) {
                return current;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] vals = new int[9];
        for (int i = 1; i < 10; i++) {
            if (i == 6) {
                continue;
            }
            vals[i - 1] = i;
        }
        System.out.println(findFromUnorderedArray(vals));
    }

}

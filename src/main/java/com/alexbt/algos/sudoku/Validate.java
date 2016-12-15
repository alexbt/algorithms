package com.alexbt.algos.sudoku;

import java.util.HashSet;
import java.util.Set;

public class Validate {

    public static boolean isValid(int[][] table) {
        boolean valid = validateStraight(table, true);
        valid = valid && validateStraight(table, false);
        valid = valid && validateSquares(table);
        return valid;
    }

    private static boolean validateSquares(int[][] table) {
        for (int offsetI = 0; offsetI <= 6; offsetI+=3) {
            for (int offsetJ = 0; offsetJ <= 6; offsetJ+=3) {
                Set<Integer> set = new HashSet<Integer>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        int no = table[offsetI + i][offsetJ + j];
                        if (no >= 0 && no <= 9) {
                            set.add(no);
                        }
                    }
                }
                if (set.size() != 9) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean validateStraight(int[][] table, boolean isLine) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int no = isLine ? table[j][i]: table[i][j];
                if (no >= 0 && no <= 9) {
                    set.add(no);
                }
            }
            if (set.size() != 9) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[][] sMatrix={
                {5,3,4,6,7,8,9,1,2},
                {6,7,2,1,9,5,3,4,8},
                {1,9,8,3,4,2,5,6,7},
                {8,5,9,7,6,1,4,2,3},
                {4,2,6,8,5,3,7,9,1},
                {7,1,3,9,2,4,8,5,6},
                {9,6,1,5,3,7,2,8,4},
                {2,8,7,4,1,9,6,3,5},
                {3,4,5,2,8,6,1,7,9}};
                
                System.out.println(isValid(sMatrix));
                
    }
}

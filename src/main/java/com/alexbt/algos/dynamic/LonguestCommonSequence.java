package com.alexbt.algos.dynamic;

public class LonguestCommonSequence {

    // . . A B A B C D C
    // . 0 0 0 0 0 0 0 0
    // B 0 0 1 1 1 1 1 1
    // C 0 0 1 1 1 2 2 2
    // D 0 0 1 1 1 2 3 3

    // (0) init 1 extra row & column to 0
    // (1) Loop on text
    // (2) For each character of substring
    // (3) -> if matches => set 1 + previousDiagonal
    // (4) -> if NO matches => set max between left or top

    // (6) navigate from bottom-right following the biggest numbers tracks
    // (7) -> Keep character when the move is diagonal

    public static int getLongestCommonSubsequence(String text, String word) {
        int textLength = text.length();
        int wordLength = word.length();
        int[][] dp = new int[wordLength + 1][textLength + 1];

        init(textLength, wordLength, dp);
        for (int j = 1; j <= textLength; j++) {
            for (int i = 1; i <= wordLength; i++) {
                if (text.charAt(j - 1) == word.charAt(i - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        return dp[wordLength][textLength];
    }

    private static void init(int textLength, int wordLength, int[][] dp) {
        for (int j = 0; j <= textLength; j++) {
            dp[0][j] = 0;
        }
        for (int i = 0; i <= wordLength; i++) {
            dp[i][0] = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(getLongestCommonSubsequence("ababcdc", "bcd"));
    }

}

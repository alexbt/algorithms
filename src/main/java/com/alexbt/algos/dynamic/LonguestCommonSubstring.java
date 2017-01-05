package com.alexbt.algos.dynamic;

public class LonguestCommonSubstring {

    // . . A B A B C D E
    // . 0 0 0 0 0 0 0 0
    // B 0 0 1 0 1 0 0 0
    // C 0 0 0 0 0 2 0 0
    // D 0 0 0 0 0 0 3 0

    // (0) init 1 extra row & column to 0
    // (1) Loop on text
    // (2) For each character of substring
    // (3) -> if matches => set 1 + previousDiagonal
    // (4) -> keep position of biggest number set

    public static int getLongestCommonSubstring(String text, String word) {
        int textlength = text.length() + 1;
        int wordLength = word.length() + 1;
        int max = 0;

        int[][] dp = new int[wordLength][textlength];

        init(dp);

        for (int i = 1; i < wordLength; i++) {
            for (int j = 1; j < textlength; j++) {
                if (text.charAt(j - 1) == word.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    if (max < dp[i][j])
                        max = dp[i][j];
                }
            }
        }

        return max;
    }

    private static void init(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i < dp[0].length; i++) {
            dp[0][i] = 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(getLongestCommonSubstring("ababcde", "bcd"));
    }
}

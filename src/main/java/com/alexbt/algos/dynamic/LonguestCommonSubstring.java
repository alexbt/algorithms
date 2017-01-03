package com.alexbt.algos.dynamic;

public class LonguestCommonSubstring {

    // . A B A B C D E
    // B 0 1 0 1 0 0 0
    // C 0 0 0 0 2 0 0
    // D 0 0 0 0 0 3 0

    // (1) Loop on text
    // (2) For each character of substring
    // (3) -> if matches => set 1 + previousDiagonal
    // (4) -> keep position of biggest number set

    public static int getLongestCommonSubstring(String text, String word) {
        int textlength = text.length();
        int wordLength = word.length();

        int max = 0;

        int[][] dp = new int[wordLength][textlength];

        for (int i = 0; i < wordLength; i++) {
            for (int j = 0; j < textlength; j++) {

                if (text.charAt(j) == word.charAt(i)) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }

                    if (max < dp[i][j])
                        max = dp[i][j];
                }

            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(getLongestCommonSubstring("ababcde", "bcd"));
    }

}

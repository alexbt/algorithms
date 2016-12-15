package com.alexbt.algos.string;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("reverse this".toCharArray()));
    }

    public static String reverseInplace(char[] str) {
        int length = str.length - 1;
        for (int i = 0; i < length / 2; i++) {
            char tmp = str[i];
            str[i] = str[length - i];
            str[length - i] = tmp;
        }
        return String.valueOf(str);
    }

    public static String reverse(char[] str) {
        int length = str.length;
        char[] newString = new char[length];

        for (int i = 0; i < length; i++) {
            newString[i] = str[length - 1 - i];
        }

        return String.valueOf(newString);
    }

    public String reverseWithStringBuilder(String str) {
        StringBuilder newString = new StringBuilder(str);
        return newString.reverse().toString();
    }
}

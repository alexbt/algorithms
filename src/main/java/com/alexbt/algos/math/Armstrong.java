package com.alexbt.algos.math;

/**
 * How to check if a number is Armstrong number or not? or write a Java program to find Armstrong number? This is a
 * common Java interview question asked on campus interviews and fresher level interviews. This is also a popular Java
 * programming exercise on various school, colleges and computer courses to build programming logic among Students. An
 * Armstrong number is a 3 digit number for which sum of cube of its digits is equal to the number itself. An example of
 * Armstrong number is 153 as 153= 1+ 125+27 which is equal to 1^3+5^3+3^3. One more example of the Armstrong number is
 * 371 because it is the sum of 27 + 343 + 1 which is equal to 3^3 + 7^3 + 1^3 . In this Java program example, we will
 * see complete code example of Java program to check if any 3 digit number is Armstrong number or not. If you are going
 * for Java interview, then be prepare for some follow-up questions e.g. finding prime numbers, or finding Armstrong
 * number of more than 3 digits.
 */
public class Armstrong {

    public static void main(String[] args) {
        System.out.println(isArmstrong(371));

    }

    private static boolean isArmstrong(int no) {

        int cube = 0;
        int sum = 0;
        int length = String.valueOf(no).length();
        for (int i = 0; i < length; i++) {
            int digit = no % 10;
            sum += digit * Math.pow(10, i);
            cube += digit * digit * digit;
            no /= 10;
        }

        return cube == sum;
    }
}

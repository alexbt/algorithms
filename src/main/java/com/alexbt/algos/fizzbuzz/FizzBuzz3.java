package com.alexbt.algos.fizzbuzz;

/**
 * Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number
 * and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”.
 * @author alexbt
 *
 */
public class FizzBuzz3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                if (i % 3 == 0) {
                    System.out.print("Fizz");
                }
                if (i % 5 == 0) {
                    System.out.print("Buzz");
                }
            } else {
                System.out.print(String.valueOf(i));
            }

            System.out.println();
        }
    }
}

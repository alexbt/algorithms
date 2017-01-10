package com.alexbt.algos.conversion;

public class Excel {

    public static void convert(int no) {
        no--;

        if (no < 26) {
            System.out.print((char) (('A') + no));
        } else {
            int div = no / 26;
            convert(div);
            convert(no % 26 + 1);
        }
    }

    public static void main(String[] args) {
        convert(1);
        System.out.println();
        convert(26);
        System.out.println();
        convert(27);
        System.out.println();

        convert(52);
        System.out.println();

        convert(53);
        System.out.println();
    }

}

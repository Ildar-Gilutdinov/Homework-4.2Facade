package org.example;

public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();

        int numA = 50;
        int numB = 30;
        System.out.println("10 -> 2:\t" + numA + " = " + Integer.toBinaryString(numA));
        // переводим числа в двоичный код
        System.out.println("10 -> 2:\t" + numB + " = " + Integer.toBinaryString(numB));
        // переводим числа в двоичный код

        System.out.println("110010 + 11110 = " + bins.sum("110010", "11110")); //50 + 30 = 80 (1010000)
        System.out.println("110010 * 11110 = " + bins.mult("110010", "11110")); //50 * 30 = 150 (10111011100)
    }
}
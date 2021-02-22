package com.letcode.easy;

/**
 * n!的阶乘
 */
public class Factorial {

    public static void main(String[] args) {
        int factorial = factorial(3);
        System.out.println(factorial);
    }

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}

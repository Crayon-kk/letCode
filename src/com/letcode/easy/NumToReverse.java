package com.letcode.easy;

/**
 * 整数反转
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。
 * 请根据这个假设，如果反转后整数溢出那么就返回 0。
 * <p>
 * 输入: 123
 * 输出: 321
 * 输入: -123
 * 输出: -321
 * 输入: 120
 * 输出: 21
 */
public class NumToReverse {

    public static void main(String[] args) {

        int num = 2147483647;
        System.out.println(reverse(num));
    }

    public static int reverse(int x) {
        long n = 0;
        while (x != 0) {
            n = n * 10 + x % 10;
            x = x / 10;
        }
        //当long转int溢出时会进行负数转换，所以不相等时就可判定为数据溢出
        return (int) n == n ? (int) n : 0;
    }
}

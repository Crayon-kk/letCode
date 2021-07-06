package com.letcode.easy;

/**
 * x的平方根，向下取整
 *
 * @Author 张海锋
 * @Date 2021/6/24 17:53
 */
public class SqrtTest {

    public static void main(String[] args) {
        int x = 10;
        System.out.println(sqrt(x));
    }

    public static int sqrt(int x) {
        int left = 0, right = x;
        int mid;
        if (0 == x || 1 == x) {
            return x;
        }
        while (left < right) {
            mid = (left + right) / 2;
            if (mid > x / mid) {
                right = mid;
            } else {
                if (left == mid) {
                    return left;
                }
                left = mid;
            }
        }
        return left;
    }

}

package com.letcode.easy;

import com.sun.xml.internal.ws.util.StringUtils;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。
 * 如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 * 如果不存在最后一个单词，请返回 0 。
 * <p>
 * 输入: "Hello World"
 * 输出: 5
 */
public class LengthOfLastWord {

    public static void main(String[] args) {
        String str = "hello q";
        System.out.println(lengthOfLastWord(str));
    }


    public static int lengthOfLastWord(String s) {
        int length = 0;
        if (s.length() == 0) {
            return length;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else if (length != 0) {
                return length;
            }
        }
        return length;
    }
}

package com.letcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 给你一个整数数组 arr，请你帮忙统计数组中每个数的出现次数。
 * 如果每个数的出现次数都是独一无二的，就返回 true；否则返回 false
 * 输入：arr = [1,2,2,1,1,3]
 * 输出：true
 * 输入：arr = [1,2]
 * 输出：false
 */
public class UniqueOccurrences {

    public static void main(String[] args) {
        int[] nums = {2, 7, 7, 11, 11, 11};
        System.out.println(uniqueOccurrences(nums));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int value : arr) {
            //getOrDefault有值就去原值，没值去默认值0
            map.put(value, map.getOrDefault(value, 0) + 1);
        }
        return map.size() == new HashSet<>(map.values()).size();
    }
}

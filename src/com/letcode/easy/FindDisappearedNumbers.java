package com.letcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {2,7,1,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // 初始化结果列表
        List<Integer> result = new ArrayList<>();
        // 遍历数组,将 nums[i] - 1 索引位置的元素标记为负数
        for(int i = 0; i < nums.length; i++) {
            // 先获取当前元素的绝对值,然后 -1 进而将当前元素转换为 nums 数组的索引值
            int index = Math.abs(nums[i]) - 1;
            // 若该索引值在数组 nums 中存在,则将其所指的元素变为负数
            if(nums[index] > 0) nums[index] = nums[index] * -1;
        }
        // 再次遍历数组,若当前数组元素 nums[i] 为负数,则说明在数组中存在数字: i + 1
        // 反之则说明数组中缺失的数字为: i + 1
        for(int i = 0; i <= nums.length - 1; i++) {
            // 将缺失的数字添加到结果列表中
            if(nums[i] > 0) result.add(i + 1);
        }
        // 返回结果列表
        return result;
    }
}

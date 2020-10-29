package com.letcode.easy;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
 * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
 * 示例 1:
 * 给定 nums = [3,2,2,3], val = 3,
 * 函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。
 * 示例 2:
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 */
public class RemoveElement {

    public static void main(String[] args) {

        int[] nums = {2, 2, 15, 15};
        int val = 15;
        System.out.println(removeElement(nums, val));

    }

    /**
     * 遍历数据并给数据重新赋值，无需定义新数组。空间为O(1)
     *
     * @param nums nums
     * @param val  val
     * @return 数组长度
     */
    public static int removeElement(int[] nums, int val) {
        int size = 0;
        for (int num : nums) {
            if (num != val) {
                nums[size] = num;
                size++;
            }
        }
        return nums.length;
    }
}

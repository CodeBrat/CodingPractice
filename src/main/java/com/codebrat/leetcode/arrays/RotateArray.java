package com.codebrat.leetcode.arrays;

import java.util.Arrays;

public class RotateArray {

    public int[] rotateWithMod(int[] nums, int k) {
        int[] temp = Arrays.copyOf(nums, nums.length);
        int offset = nums.length - k;
        for(int i = 0; i < nums.length; i++) {
            nums[i] = temp[(offset+i) %nums.length];
        }
        return nums;
    }

    private int[] reverseArray(int start, int end, int[] array) {
        while(start<end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return array;
    }


    private int[] rotateWithReverse(int[] nums, int length, int k) {
        reverseArray(0, length-k-1, nums);
        reverseArray(length-k, length-1, nums);
        reverseArray(0, length-1, nums);
        return nums;
    }

    public void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k%length;
        rotateWithReverse(nums, length, k);
    }
}

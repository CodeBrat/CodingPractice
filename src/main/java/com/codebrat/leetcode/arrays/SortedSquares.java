package com.codebrat.leetcode.arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        if(nums.length == 1){
            nums[0] = nums[0] * nums[0];
            return nums;
        }
        int start = 0;
        int end = nums.length-1;
        int[] result = new int[nums.length];
        for(int i = nums.length-1; i >= 0; i--) {
            if(Math.abs(nums[start]) > Math.abs(nums[end])){
                result[i] = nums[start] * nums[start];
                start++;
            } else {
                result[i] = nums[end] * nums[end];
                end--;
            }
        }
        return result;
    }
}

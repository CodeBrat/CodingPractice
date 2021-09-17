package com.codebrat.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twosum(int[] nums, int target) {

		Map<Integer, Integer> numsMap = new HashMap<Integer, Integer>();
		int[] result = null;

		for (int i = 0; i < nums.length; i++) {
			int complTarget = target - nums[i];
			if (numsMap.containsKey(complTarget)) {
				result = new int[] { numsMap.get(complTarget), i };
				break;
			}
			numsMap.put(nums[i], i);
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

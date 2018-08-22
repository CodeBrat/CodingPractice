package com.codebrat.leetcode;

import java.util.HashMap;

public class LongestNonRepeatingSubstring {

	public static int lengthOfLongestSubstring(String s) {
		int count = 0;
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (charMap.containsKey(s.charAt(i))) {
				j = Math.max(j, charMap.get(s.charAt(i)) + 1);
			}
			charMap.put(s.charAt(i), i);
			count = Math.max(count, i - j + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count = lengthOfLongestSubstring("dvdf");

		System.out.println(count);

	}

}

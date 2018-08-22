package com.codebrat.leetcode;

public class Anagrams {

	public static boolean isAnagram(String wordA, String wordB) {
		int result = 0;

		if (wordA.length() != wordB.length()) {
			return false;
		}

		for (int i = 0; i < wordA.length(); i++) {
			result += wordA.charAt(i);
			result -= wordB.charAt(i);
		}

		return result == 0 ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("ababaaba", "abaabaaa"));
	}

}

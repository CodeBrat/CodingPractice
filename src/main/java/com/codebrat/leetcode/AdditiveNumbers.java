package com.codebrat.leetcode;

public class AdditiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String number = "112358";
		int n = number.length();
		for (int i = 1; i <= n / 2; i++) {
			for (int j = 1; Math.max(j, i) <= n - i - j; ++j) {
				System.out.println(i + " " + j);
			}
		}
	}
}

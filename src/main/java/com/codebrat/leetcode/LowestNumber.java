package com.codebrat.leetcode;

public class LowestNumber {

	public static String lowestNumber(String number, int n) {
		String result = number;
		for (int j = 0; j < result.length() - 1 && n-- > 0; j++) {
			System.out.println(result + " " + j);
			if (result.charAt(j) > result.charAt(j + 1)) {
				result = result.substring(0, j)
						+ result.substring(j + 1, result.length());
				break;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result = lowestNumber("7167534", 2);
		System.out.println(result);

	}

}

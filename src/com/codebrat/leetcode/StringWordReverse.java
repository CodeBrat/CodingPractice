package com.codebrat.leetcode;

public class StringWordReverse {

	private static char[] reverse(char[] sArray, int start, int end) {

		for (; start < end; start++, end--) {
			char temp = sArray[start];
			sArray[start] = sArray[end];
			sArray[end] = temp;
		}

		return sArray;
	}

	public static String reverseWords(String s) {
		if (s.equals("[\\s]*"))
			return "";
		char[] sArray = s.toCharArray();
		int start = 0;
		for (int i = 0; i < sArray.length; i++) {
			if (' ' == sArray[i]) {
				sArray = reverse(sArray, start, i - 1);
				start = i + 1;
			}
			if (i == sArray.length - 1) {
				sArray = reverse(sArray, start, i);
			}
		}
		sArray = reverse(sArray, 0, s.length() - 1);
		return new String(sArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "     ";

		System.out.println(reverseWords(s));

	}
}

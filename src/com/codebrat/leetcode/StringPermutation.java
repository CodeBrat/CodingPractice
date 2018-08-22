package com.codebrat.leetcode;

import java.util.LinkedList;
import java.util.List;

public class StringPermutation {

	private String swap(String input, int i, int j) {
		char[] inArray = input.toCharArray();
		char temp = inArray[i];
		inArray[i] = inArray[j];
		inArray[j] = temp;
		return new String(inArray);
	}

	private void permuteSwap(String input, int l, int r, List<String> resultList) {
		if (l == r && !resultList.contains(input))
			resultList.add(input);
		else {
			for (int i = l; i <= r; i++) {
				input = swap(input, l, i);
				permuteSwap(input, l + 1, r, resultList);
				input = swap(input, l, i);
			}
		}
	}

	public static void main(String[] args) {

		String input = "AABC";

		List<String> resultList = new LinkedList<String>();

		StringPermutation permute = new StringPermutation();
		permute.permuteSwap(input, 0, input.length() - 1, resultList);

		resultList.stream().forEach(System.out::println);
	}

}

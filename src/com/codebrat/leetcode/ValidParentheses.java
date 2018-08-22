package com.codebrat.leetcode;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

	public static boolean isValid(String s) {
		HashMap bracEnum = new HashMap();
		bracEnum.put('{', '}');
		bracEnum.put('[', ']');
		bracEnum.put('(', ')');

		Stack bracStack = new Stack();

		for (char c : s.toCharArray()) {
			if (bracEnum.keySet().contains(c)) {
				bracStack.push(bracEnum.get(c));
			} else {
				if (c != (char) bracStack.pop()) {
					return false;
				}
			}
		}

		return bracStack.empty() ? true : false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package com.codebrat.leetcode;

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode result = new ListNode(0);
		ListNode temp = result;
		int sum, carry = 0;

		while (l1 != null || l2 != null || carry != 0) {
			sum = ((l1 == null) ? 0 : l1.val) + ((l2 == null) ? 0 : l2.val)
					+ carry;
			temp.next = new ListNode(sum % 10);
			carry = sum / 10;
			temp = temp.next;
			l1 = l1 == null ? l1 : l1.next;
			l2 = l2 == null ? l2 : l2.next;
		}

		return result.next;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package dataStructures;

// Definition for singly-linked list.
class ListNode {

	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

	// Queue<E>
}

class Solution {

	public static ListNode rotateRight(ListNode head, int k) {

		int lsize = 1;

		ListNode lastNode = head;
		while (lastNode.next != null) {
			lsize++;
			lastNode = lastNode.next;
		}

		k = k % lsize;

		lastNode.next = head;

		int count = 1;
		ListNode temp = head;
		while (count <= lsize) {

			if (count == (lsize - k)) {
				head = temp.next;
				temp.next = null;
				break;
			}

			temp = temp.next;
			count++;
		}

		return head;
	}

}

public class X {

	public static void main(String[] args) {

		ListNode x = new ListNode(5);
		ListNode y = new ListNode(4, x);
		ListNode z = new ListNode(3, y);
		ListNode head = new ListNode(2, z);

		System.out.println(Solution.rotateRight(head, 2).val);

	}

}

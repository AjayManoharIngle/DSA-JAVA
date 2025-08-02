package linkedlist;

import linkedlist.helper.Node;

// O(n)
public class LengthSLL_9 {

	// 1,2,3,4,5 => nodes => length => 5
	
	public static void main(String[] args) throws Exception {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		System.out.println("Length  : " + length(head));
	}

	private static int length(Node head) {
		if(head == null) {
			return 0;
		}
		int len = 1;
		while(head.next != null) {
			head = head.next;
			len++;
		}
		return len;
	}

}

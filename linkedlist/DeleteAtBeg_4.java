package linkedlist;

import linkedlist.helper.Node;
import linkedlist.helper.PrintLinkedList;

// O(1)
public class DeleteAtBeg_4 {
	
	// 1,2,3 => nodes => delete at beg => OP => 2,3

	public static void main(String[] args) throws Exception {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		try {
			head = deleteAtbeg(head);
		} catch (Exception e) {
			throw new Exception("You can not insert node");
		}
		PrintLinkedList.printLinkedList(head);
	}

	private static Node deleteAtbeg(Node head) throws Exception {
		if(head == null) {
			return head;
		}
		return head.next;
	}
}

package linkedlist;

import linkedlist.helper.Node;
import linkedlist.helper.PrintLinkedList;

// O(n)
public class DeleteAtEnd_5 {
	
	// 1,2,3 => nodes => delete at end => OP => 1,2

	public static void main(String[] args) throws Exception {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		try {
			head = deleteAtEnd(head);
		} catch (Exception e) {
			throw new Exception("You can not insert node");
		}
		PrintLinkedList.printLinkedList(head);
	}

	private static Node deleteAtEnd(Node head) throws Exception {
		if(head == null) {
			return head;
		}
		Node currentNode = head;
		while(currentNode.next.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = null;
		return head;
	}
}

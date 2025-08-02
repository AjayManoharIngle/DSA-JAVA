package linkedlist;

import linkedlist.helper.Node;
import linkedlist.helper.PrintLinkedList;

// O(1)
public class InsertAtBeg_1 {

	// 1,2,3 => nodes => insert at 4 beg => OP => 4,1,2,3
	
	public static void main(String[] args) throws Exception {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		try {
			head = insertNewNodeAtbeg(head,4);
		} catch (Exception e) {
			throw new Exception("You can not insert node");
		}
		PrintLinkedList.printLinkedList(head);
	}

	private static Node insertNewNodeAtbeg(Node head, int data) throws Exception {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return head;
		}
		newNode.next = head;
		head = newNode;
		return head;
	}
}

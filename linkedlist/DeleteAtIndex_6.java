package linkedlist;

import linkedlist.helper.Node;
import linkedlist.helper.PrintLinkedList;

// O(index)
public class DeleteAtIndex_6 {
	
	// 1,2,3,4,5 => nodes => delete index 2 => OP => 1,2,4,5
	//[0,1,2,3,4] => index

	public static void main(String[] args) throws Exception {
		int index = 2;
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		try {
			head = deleteByIndex(head,index);
		} catch (Exception e) {
			throw new Exception("Index " + index + " is not found");
		}
		PrintLinkedList.printLinkedList(head);	
	}

	private static Node deleteByIndex(Node head, int index) throws Exception {
		if(head == null) {
			return head;
		}
		if(index == 0) {
			return head.next;
		}
		Node currNode = head;
		int counter = 0;
		while(currNode != null && counter < index-1) {
			currNode = currNode.next;
			counter++;
		}
		if(currNode == null || currNode.next == null) {
			throw new Exception("Invalid index");
		}
		currNode.next = currNode.next.next;
		return head;
	}
}

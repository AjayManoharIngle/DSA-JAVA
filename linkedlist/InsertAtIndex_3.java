package linkedlist;

import linkedlist.helper.Node;
import linkedlist.helper.PrintLinkedList;

// O(index)
public class InsertAtIndex_3 {
	
	// 1,2,3,4,5 => nodes => insert at 6 at index 2 => OP => 1,2,6,3,4,5
	//[0,1,2,3,4] => index

	public static void main(String[] args) throws Exception {
		int index = 3;
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		try {
			head = insertNewNodeAtMidByIndex(head,6,index);
		} catch (Exception e) {
			throw new Exception("Index " + index + " is not found");
		}
		PrintLinkedList.printLinkedList(head);
	}

	private static Node insertNewNodeAtMidByIndex(Node head, int data , int index) throws Exception {
		Node newNode = new Node(data);
		if(index == 0) {
			newNode.next = head;
			return head;
		}
		Node currNode = head;
		int counter = 0;
		while(currNode!= null && counter < index-1) {
			currNode = currNode.next;
			counter++;
		}
		if(currNode == null) {
			throw new Exception("Index out of bound : " + index);
		}
		newNode.next = currNode.next;
		currNode.next =newNode;
		return head;
	}
}

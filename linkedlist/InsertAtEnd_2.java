package linkedlist;

import linkedlist.helper.Node;
import linkedlist.helper.PrintLinkedList;

// O(n)
public class InsertAtEnd_2 {

	// 1,2,3 => nodes => insert at 4 end => OP => 1,2,3,4
	
	public static void main(String[] args) throws Exception {
			Node head = new Node(1);
			head.next = new Node(2);
			head.next.next = new Node(3);
			try {
				head = insertNewNodeAtEnd(head,4);
			} catch (Exception e) {
				throw new Exception("You can not insert node");
			}
			PrintLinkedList.printLinkedList(head);
	}

	public static Node insertNewNodeAtEnd(Node node, int data) throws Exception {
		Node newNode = new Node(data);
		if(node == null) {
			node = newNode;
			return node;
		}
		Node currentNode = node;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = newNode;
		return node;
	}
}

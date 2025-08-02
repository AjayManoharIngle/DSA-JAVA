package linkedlist;

import linkedlist.helper.Node;
import linkedlist.helper.PrintLinkedList;

// O(n)
public class DeleteAtTarget_8 {

	// 1,2,3,4,5 => nodes => delete by value 4 => OP => 1,2,3,5
	//[0,1,2,3,4] => index

	public static void main(String[] args) throws Exception {
		int target = 5;
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		try {
			head = deleteByValue(head,target);
		} catch (Exception e) {
			throw new Exception("Target " + target + " is not found");
		}
		PrintLinkedList.printLinkedList(head);		
	}

	private static Node deleteByValue(Node head, int target) throws Exception {
		Node currentNode = head;
		if(head == null) {
			return head;
		}
		if(currentNode.data == target) {
			return head.next;
		}else {
			while(currentNode.next !=null && currentNode.next.data!=target) {
				currentNode = currentNode.next;
			}
			if(currentNode == null || currentNode.next == null) {
				throw new Exception("Invalid index");
			}
			currentNode.next = currentNode.next.next;
		}
		return head;
	}
}

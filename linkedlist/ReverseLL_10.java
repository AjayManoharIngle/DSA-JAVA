package linkedlist;

import linkedlist.helper.Node;
import linkedlist.helper.PrintLinkedList;

// O(n)
public class ReverseLL_10 {

	// 1,2,3,4,5 => nodes => OP => 5,4,3,2,1
	
	public static void main(String[] args) throws Exception {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head = reverse(head);
		PrintLinkedList.printLinkedList(head);	
		
		// initial
		// 100=[1,101],101=[2,102],102=[3,103],103=[4,104],104=[5,105],105=[6,null]
		
		// newNode=101,prev=100,currNode=101
		// 100=[1,null],101=[2,102],102=[3,103],103=[4,104],104=[5,105],105=[6,null]
		
		// newNode=102,prev=101,currNode=102
		// 100=[1,null],101=[2,100],102=[3,103],103=[4,104],104=[5,105],105=[6,null]

		// newNode=103,prev=102,currNode=103
		// 100=[1,null],101=[2,100],102=[3,101],103=[4,104],104=[5,105],105=[6,null]

		// newNode=104,prev=103,currNode=104
		// 100=[1,null],101=[2,100],102=[3,101],103=[4,102],104=[5,105],105=[6,null]

		// newNode=105,prev=104,currNode=105
		// 100=[1,null],101=[2,100],102=[3,101],103=[4,102],104=[5,103],105=[6,null]

		// newNode=null,prev=105,currNode=null
		// 100=[1,null],101=[2,100],102=[3,101],103=[4,102],104=[5,103],105=[6,104]
	}

	private static Node reverse(Node head) {
		if(head == null) {
			return head;
		}
		Node currNode = head;
		Node prev = null;
		while(currNode!=null) {
			Node newNode = currNode.next;
			currNode.next = prev;
			prev = currNode;
			currNode = newNode;
		}
		return prev;
	}

}

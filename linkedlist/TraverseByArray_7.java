package linkedlist;

import linkedlist.helper.Node;
import linkedlist.helper.PrintLinkedList;

public class TraverseByArray_7 {

	public static void main(String[] args) throws Exception {
		
		int arr[] = {1,2,3,4};
		traverseArr(arr);
	}

	private static void traverseArr(int[] arr) throws Exception {
		if(arr.length == 0) {
			throw new Exception("arr can't be empty");
		}
		Node node = new Node(arr[0]);
		for(int i=1;i<arr.length;i++) {
			InsertAtEnd_2.insertNewNodeAtEnd(node,arr[i]);
		}
		PrintLinkedList.printLinkedList(node);
	}
}

package linkedlist.helper;

public class PrintLinkedList {

	public static void printLinkedList(Node node) throws Exception {
		if(node == null) {
			throw new Exception("You can not print value as node is null");
		}
		System.out.print(node.data+"->");
		while(node.next != null) {
			node = node.next;
			System.out.print(node.data+"->");
		}
		System.out.println("null");
	}
}

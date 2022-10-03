package linkedList;

public class LinkedListProbleams {
	
	static Node reverseLL(Node head) {
		Node curr = head, prev = null;
		while(curr != null) {
			Node temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}
	
	static Node reverseRecursiveLL(Node head) {
		if(head == null || head.next == null) return head;
		
		Node temp = head.next;
		Node newHead = reverseRecursiveLL(head.next);
		temp.next = head;
		head.next = null;
		return newHead;
	}
	
	static void printLL(Node head) {
		Node curr = head;
		while(curr != null) {
			System.out.print(curr.data+" ");
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		
		Node head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		printLL(head);
		//Node newHead = reverseLL(head);
		Node newHead = reverseRecursiveLL(head);
		printLL(newHead);
	}

}
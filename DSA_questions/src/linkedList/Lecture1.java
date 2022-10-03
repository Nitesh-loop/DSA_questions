package linkedList;

public class Lecture1 {
	
	public static void printLL(Node head) {
		Node cur = head;

		while(cur!=null) {
			System.out.print(cur.data + " -> ");
			cur = cur.next;
		}
		System.out.print(" end");

	}
	
	public static Node insertLL(Node head, int data, int pos) {
		
		Node newNode = new Node(data);
		
		if(pos == 0) {
			newNode.next = head;
			head = newNode;
			return head;
	 	}
		
		Node cur = head;
		for(int i = 0; i<pos-1; i++) {
			cur = cur.next;
			if(cur == null) return head;
		}
		newNode.next = cur.next;
		cur.next = newNode;
		return head;
		
		
	}

	public static void main(String[] args) {
		
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		
		Node head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		
		printLL(head);
		System.out.println();
		head = insertLL(head, 100, 3);
		System.out.println();
		printLL(head);

	}

}


class Node {
	int data;
	Node next;
	
	public Node(int data) {
		this.data = data;
	}
}
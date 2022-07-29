package linkedList;

public class Basics {
	
	static void printLL(Node head) {
		Node cur = head;
		while(cur!=null) {
			System.out.print(cur.data+" -> ");
			cur = cur.next;
		}
		System.out.println("end");
	}

	static Node insertLL(int data, int position, Node head) {
		
		Node newNode = new Node(data);
		if(position == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		Node cur = head;
		for(int i = 0; i<position-1; i++) {
			cur = cur.next;
		}
		newNode.next = cur.next;
		cur.next = newNode;
		return head;
		
	}
	
	static Node deleteLL(int position, Node head) {
		if(head == null) return null;
		if(position == 0) {
			head = head.next;
			return head;
		}
		Node cur = head;
		for(int i=0; i<position-1; i++) {
			cur= cur.next;
		}
		cur.next = cur.next.next;
		return head;
	}
	
	static int findMiddleLL(Node head) {
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	public static void main(String[] args) {
		
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
//		Node n6 = new Node(60);
		
		Node head = n1;
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
//		n5.next = n6;
		
		printLL(head);
		head = insertLL(200, 0, head);
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
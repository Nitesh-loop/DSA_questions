package binaryTreeBasics;

import java.util.Scanner;

public class BinaryTree {
	
	Scanner sc;
	Node root;
	
	public BinaryTree() {
		sc = new Scanner(System.in);
	}
	
	// creates a binary tree and returns the root  node
	Node createBinaryTree() {
			System.out.println("Enter node data");
			int data = sc.nextInt();
			
			if(data == -1) return null;
			
			Node node = new Node(data);
			
			System.out.println("Enter "+ data + "'s left data");
			node.left = createBinaryTree();
			
			System.out.println("Enter "+ data + "'s right data");
			node.right = createBinaryTree();
			
			return node;
			
		}
	
	void inOrderTraversal(Node root) {
		if(root == null) return;
		
		inOrderTraversal(root.left);
		System.out.println(root.data);
		inOrderTraversal(root.right);
	}
	
	class Node {
		int data;
		Node left, right;
		
		public Node(int data) {
			this.data = data;
			
		}
	}
	
	
}

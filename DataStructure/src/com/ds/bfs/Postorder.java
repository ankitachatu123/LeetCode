package com.ds.bfs;

public class Postorder {

	static void printPreorder(Node node) {
		if (node == null)
			return;
		// Preorder
		// System.out.print(node.data + " ");

		printPreorder(node.left);

		// InOrder
		// System.out.print(node.data + " ");

		printPreorder(node.right);
		// PostOrder
		System.out.print(node.data + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		printPreorder(root);
	}

}

package com.ds.bfs;


public class RecurssionI {

	public static boolean callRecurssionI(Node root, int level) {
		if (root ==null) {
			return false;
		}
		if (level==1) {
			System.out.print( " "+root.data);
			return 	true;
		}
		boolean left=callRecurssionI(root.left, level-1);
	    boolean right=callRecurssionI(root.right, level-1);
		return left|| right;
	}
	
	public static void levelOrderTraversal(Node root)
	{
			int level = 1;
		while (callRecurssionI(root, level)) {
			level++;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node rootNode = new Node(2);
		rootNode.left = new Node(4);
		rootNode.right = new Node(5);
		rootNode.left.left = new Node(6);
		rootNode.left.right = new Node(7);
		rootNode.right.left = new Node(8);
		rootNode.right.right = new Node(9);
		levelOrderTraversal(rootNode);
		//[2][4][6][7][5][8][9]

	}

}

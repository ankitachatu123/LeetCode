package com.ds.bfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthForSearch {// Inorder8tu

	public static List<Integer> preOrder(Node root) {
		List<Integer> l=new ArrayList<>();
		if (root == null) {
			return l;
		} else {
			Stack<Node> nodeLeftRight = new Stack<>();
			nodeLeftRight.push(root);
				while (nodeLeftRight.isEmpty()==false) {
					l.add(nodeLeftRight.peek().data);
				Node tempNode =nodeLeftRight.pop();
				if (tempNode.right != null) {
					nodeLeftRight.push(tempNode.right);
				}
				if (tempNode.left != null) {
					nodeLeftRight.push(tempNode.left);
				}
			}

		}
		return l;
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
		List<Integer> res=preOrder(rootNode);
		System.out.println(res);
	}

}

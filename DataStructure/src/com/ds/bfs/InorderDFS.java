package com.ds.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class InorderDFS {
	public static List<Integer> inOrder(Node root) {
		List<Integer> list = new ArrayList<Integer>();
		if (root == null)
			return list;
		Stack<Node> stack = new Stack<>();
		Node curr = root;
		while (curr != null || !stack.isEmpty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			curr = stack.pop();
			list.add(curr.data);
			curr = curr.right;
		}
		return list;
	}

	public static List<List<Integer>> levelOrder(Node root) {
		List<List<Integer>> list = new ArrayList<>();
		if (root == null)
			return list;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			List<Integer> list5 = new ArrayList<>();
			Node node = queue.poll();
			list5.add(node.data);
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
			// }
			list.add(list5);
		}
		return list;

	}

	public static void main(String[] args) {
		Node rootNode = new Node(2);
		rootNode.left = new Node(4);
		rootNode.right = new Node(5);
		rootNode.left.left = new Node(6);
		rootNode.left.right = new Node(7);
		rootNode.right.left = new Node(8);
		rootNode.right.right = new Node(9);
		// List<Integer> res = inOrder(rootNode);
		List<List<Integer>> list = levelOrder(rootNode);
		System.out.println(list);

		// TODO Auto-generated method stub

	}

}

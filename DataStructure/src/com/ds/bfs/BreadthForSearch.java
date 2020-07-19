package com.ds.bfs;

import java.util.LinkedList;
import java.util.Queue;

class Node{
	Node left;
	Node right;
	int data;
	
	public Node(int val) {
		// TODO Auto-generated constructor stub
		this.data=val;
	}
}
public class BreadthForSearch {
	
 public static void breadthtraverse(Node root){
	 Queue<Node> bfs= new LinkedList<>();
	 if (root==null){
		 return;
	 }else{
		 bfs.add(root);
		 while(!bfs.isEmpty()){
			 System.out.println(bfs.peek().data);
			 Node node2=bfs.poll();//removes head
			 if (node2.left!=null) {
				bfs.add(node2.left);
			}
			 if (node2.right!=null) {
				 bfs.add(node2.right);	
				 
			}
		 }
	 }
	
 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node rootNode=new Node(2);
	       rootNode.left=new Node(4);
	       rootNode.right=new Node(5);
	       rootNode.left.left=new Node(6);
	       rootNode.left.right=new Node(7);
	       rootNode.right.left=new Node(8);
	       rootNode.right.right=new Node(9);
	       breadthtraverse(rootNode);
	}

}

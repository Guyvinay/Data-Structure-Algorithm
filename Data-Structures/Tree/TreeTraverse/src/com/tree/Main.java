package com.tree;

public class Main {

	public void preorder(Node node)
	{
		if(node!=null) {
			System.out.print(node.data+"  ");
			preorder(node.left);
			preorder(node.right);
		}
	}
	public void inorder(Node node)
	{
		if(node!=null) {
			preorder(node.left);
			System.out.print(node.data+"  ");
			preorder(node.right);
		}
	}
	public void postorder(Node node)
	{
		if(node!=null) {
			preorder(node.left);
			preorder(node.right);
			System.out.print(node.data+"  ");
		}
	}
	
	public static void main(String[] args) {
		Node node = new Node(1);
		node.left = new Node(2);
		node.left.left = new Node(4);
		node.right = new Node(3);
		node.right.right = new Node(5);
		node.right.right.left = new Node(8);
		node.right.right.right = new Node(9);
		Main main = new Main();
		System.out.println("Preorder");
		main.preorder(node);
		System.out.println();
		System.out.println("Inorder");
		main.inorder(node);
		System.out.println();
		System.out.println("Postorder");
		main.postorder(node);
	}

}

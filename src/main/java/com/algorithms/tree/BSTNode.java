package com.algorithms.tree;

public class BSTNode {
	public BSTNode left;
	public BSTNode right;
	public int x;

	public BSTNode(int x) {
		super();
		this.x = x;
	}

	public BSTNode(int x, BSTNode left, BSTNode right) {
		super();
		this.left = left;
		this.right = right;
		this.x = x;
	}

}

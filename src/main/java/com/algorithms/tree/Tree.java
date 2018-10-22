package com.algorithms.tree;

public class Tree {
	public Tree left;
	public Tree right;
	public int x;

	public Tree(int x) {
		super();
		this.x = x;
	}

	public Tree(int x, Tree left, Tree right) {
		super();
		this.left = left;
		this.right = right;
		this.x = x;
	}

}

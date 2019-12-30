package com.algorithms.tree;

public class BST {
  private BSTNode root;

  public BST(BSTNode root) {
    super();
    this.root=root;
  }


  public BSTNode findNode(int value) {
    return findNode(root,value);
  }


  private BSTNode findNode(BSTNode parent, int value) {
    if(parent == null) return null;

    if(value == parent.x) return parent;

    if(value < parent.x) return findNode(parent.left,value);

    return findNode(parent.right,value);
  }
}

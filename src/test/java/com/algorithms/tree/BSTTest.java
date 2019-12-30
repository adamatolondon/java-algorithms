package com.algorithms.tree;

import org.junit.Assert;
import org.junit.Test;


public class BSTTest extends AbstractBSTTest {
  @Test
  public void findNode() {
    BSTNode root=new BSTNode(10);
    BST bst=new BST(root);
    BSTNode bstNode=bst.findNode(10);
    Assert.assertNotNull(bstNode);
    bstNode=bst.findNode(5);
    Assert.assertNull(bstNode);
  }


  @Test
  public void findNodeSimple() {
    BSTNode root=createSimpleTree();
    BST bst=new BST(root);
    BSTNode bstNode=bst.findNode(4);
    Assert.assertNotNull(bstNode);
    bstNode=bst.findNode(8);
    Assert.assertNull(bstNode);
  }
}

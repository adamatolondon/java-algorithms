package com.algorithms.tree;

import org.junit.Assert;
import org.junit.Test;


public class TreePreOrderTraversalRecTest extends AbstractBSTTest {

  @Test
  public void simpleTreeOneNodeRecursive() {
    BSTNode tree=new BSTNode(7);
    PreOrderTraversalRecursive preOrderTraversal=new PreOrderTraversalRecursive();
    int n=preOrderTraversal.findMaxDistinctValuesRecursive(tree);
    Assert.assertEquals(1,n);
  }


  @Test
  public void simpleTreeRecursive() {
    BSTNode tree=createSimpleTree();
    PreOrderTraversalRecursive preOrderTraversal=new PreOrderTraversalRecursive();
    int n=preOrderTraversal.findMaxDistinctValuesRecursive(tree);
    Assert.assertEquals(4,n);
  }


  @Test
  public void complexTreeRecursive() {
    BSTNode tree=createComplexTree();
    PreOrderTraversalRecursive preOrderTraversal=new PreOrderTraversalRecursive();
    int n=preOrderTraversal.findMaxDistinctValuesRecursive(tree);
    Assert.assertEquals(5,n);
  }

}

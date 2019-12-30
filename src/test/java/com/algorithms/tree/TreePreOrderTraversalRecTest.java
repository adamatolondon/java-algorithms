package com.algorithms.tree;

import org.junit.Assert;
import org.junit.Test;

public class TreePreOrderTraversalRecTest {

	/* .......... 2 ....... */
	/* ......... / \ ...... */
	/* ........ 3 . 7 ..... */
	/* ....... / .......... */
	/* ...... 4 ........... */
	/* ..... / \ .......... */
	/* .... 5 .. 4 ........ */
	private BSTNode createSimpleTree() {
		BSTNode treeL4_1 = new BSTNode(4);
		BSTNode treeL4_2 = new BSTNode(5);

		BSTNode treeL3 = new BSTNode(4);
		treeL3.left = treeL4_2;
		treeL3.right = treeL4_1;

		BSTNode treeL2_1 = new BSTNode(3);
		treeL2_1.left = treeL3;

		BSTNode treeL2_2 = new BSTNode(7);

		BSTNode treeL1 = new BSTNode(2);
		treeL1.left = treeL2_1;
		treeL1.right = treeL2_2;
		return treeL1;
	}

	private BSTNode createComplexTree() {
		BSTNode treeL5_1 = new BSTNode(10);
		BSTNode treeL5_2 = new BSTNode(9);
		BSTNode treeL5_3 = new BSTNode(4);
		BSTNode treeL5_4 = new BSTNode(4);

		BSTNode treeL4_1 = new BSTNode(3);
		BSTNode treeL4_2 = new BSTNode(8, treeL5_1, treeL5_2);
		BSTNode treeL4_3 = new BSTNode(8);
		BSTNode treeL4_4 = new BSTNode(8, treeL5_3, treeL5_4);

		BSTNode treeL3_1 = new BSTNode(2, treeL4_1, treeL4_2);
		BSTNode treeL3_2 = new BSTNode(7);
		BSTNode treeL3_3 = new BSTNode(6, treeL4_3, treeL4_4);

		BSTNode treeL2_1 = new BSTNode(3, treeL3_1, treeL3_2);
		BSTNode treeL2_2 = new BSTNode(5, treeL3_3, null);

		BSTNode treeL1_1 = new BSTNode(4, treeL2_1, treeL2_2);
		return treeL1_1;
	}

	@Test
	public void simpleTreeOneNodeRecursive() {
		BSTNode tree = new BSTNode(7);
		PreOrderTraversalRecursive preOrderTraversal = new PreOrderTraversalRecursive();
		int n = preOrderTraversal.findMaxDistinctValuesRecursive(tree);
		Assert.assertEquals(1, n);
	}

	@Test
	public void simpleTreeRecursive() {
		BSTNode tree = createSimpleTree();
		PreOrderTraversalRecursive preOrderTraversal = new PreOrderTraversalRecursive();
		int n = preOrderTraversal.findMaxDistinctValuesRecursive(tree);
		Assert.assertEquals(4, n);
	}

	@Test
	public void complexTreeRecursive() {
		BSTNode tree = createComplexTree();
		PreOrderTraversalRecursive preOrderTraversal = new PreOrderTraversalRecursive();
		int n = preOrderTraversal.findMaxDistinctValuesRecursive(tree);
		Assert.assertEquals(5, n);
	}

}

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
	private Tree createSimpleTree() {
		Tree treeL4_1 = new Tree(4);
		Tree treeL4_2 = new Tree(5);

		Tree treeL3 = new Tree(4);
		treeL3.left = treeL4_2;
		treeL3.right = treeL4_1;

		Tree treeL2_1 = new Tree(3);
		treeL2_1.left = treeL3;

		Tree treeL2_2 = new Tree(7);

		Tree treeL1 = new Tree(2);
		treeL1.left = treeL2_1;
		treeL1.right = treeL2_2;
		return treeL1;
	}

	private Tree createComplexTree() {
		Tree treeL5_1 = new Tree(10);
		Tree treeL5_2 = new Tree(9);
		Tree treeL5_3 = new Tree(4);
		Tree treeL5_4 = new Tree(4);

		Tree treeL4_1 = new Tree(3);
		Tree treeL4_2 = new Tree(8, treeL5_1, treeL5_2);
		Tree treeL4_3 = new Tree(8);
		Tree treeL4_4 = new Tree(8, treeL5_3, treeL5_4);

		Tree treeL3_1 = new Tree(2, treeL4_1, treeL4_2);
		Tree treeL3_2 = new Tree(7);
		Tree treeL3_3 = new Tree(6, treeL4_3, treeL4_4);

		Tree treeL2_1 = new Tree(3, treeL3_1, treeL3_2);
		Tree treeL2_2 = new Tree(5, treeL3_3, null);

		Tree treeL1_1 = new Tree(4, treeL2_1, treeL2_2);
		return treeL1_1;
	}

	@Test
	public void simpleTreeOneNodeRecursive() {
		Tree tree = new Tree(7);
		PreOrderTraversalRecursive preOrderTraversal = new PreOrderTraversalRecursive();
		int n = preOrderTraversal.findMaxDistinctValuesRecursive(tree);
		Assert.assertEquals(1, n);
	}

	@Test
	public void simpleTreeRecursive() {
		Tree tree = createSimpleTree();
		PreOrderTraversalRecursive preOrderTraversal = new PreOrderTraversalRecursive();
		int n = preOrderTraversal.findMaxDistinctValuesRecursive(tree);
		Assert.assertEquals(4, n);
	}

	@Test
	public void complexTreeRecursive() {
		Tree tree = createComplexTree();
		PreOrderTraversalRecursive preOrderTraversal = new PreOrderTraversalRecursive();
		int n = preOrderTraversal.findMaxDistinctValuesRecursive(tree);
		Assert.assertEquals(5, n);
	}

}

package com.algorithms.tree;

import java.util.HashSet;
import java.util.Set;

/**
 * Path with maximum distinct nodes in a Binary Tree.
 * 
 * @author Antonio Damato
 *
 */
public class PreOrderTraversalRecursive {

	private int findDistinctRecursive(Tree tree, Set<Integer> values) {
		if (tree.left == null && tree.right == null)
			return values.size();

		int maxLeft = 0;
		if (tree.left != null) {
			Set<Integer> setLeft = new HashSet<Integer>(values);
			setLeft.add(tree.left.x);
			maxLeft = findDistinctRecursive(tree.left, setLeft);
		}

		int maxRight = 0;
		if (tree.right != null) {
			Set<Integer> setRight = new HashSet<Integer>(values);
			setRight.add(tree.right.x);
			maxRight = findDistinctRecursive(tree.right, setRight);
		}

		return maxLeft > maxRight ? maxLeft : maxRight;
	}

	public int findMaxDistinctValuesRecursive(Tree tree) {
		Set<Integer> values = new HashSet<Integer>();
		values.add(tree.x);
		return findDistinctRecursive(tree, values);
	}
}

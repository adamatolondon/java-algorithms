package com.algorithms.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Path with maximum distinct nodes in a Binary Tree.
 * 
 * @author Antonio Damato
 *
 */
public class LevelOrderTraversalRecursive {

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
		List<Set<Integer>> values = new ArrayList<Set<Integer>>();
		Set<Integer> listValues = new HashSet<Integer>();
		listValues.add(tree.x);
		values.add(listValues);
		List<Tree> level = new ArrayList<Tree>();
		level.add(tree);
		return findDistinctRecursive(tree, listValues);
	}
}

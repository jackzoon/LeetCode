package com.halen.step01;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树的前序遍历
 * @author halen
 *
 */
public class P_144 {
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
		preOrder(root, list);
		return list;
		
    }
	
	//递归前序遍历
	private void preOrder(TreeNode node,List<Integer> list) {
		if(node==null)
			return;
		list.add(node.val);
		preOrder(node.left, list);
		preOrder(node.right, list);
	}
	
	//迭代前序遍历
	private void preOrderNR(TreeNode root,List<Integer> list) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while(!stack.isEmpty()) {
			TreeNode cur = stack.pop();
			list.add(cur.val);
			if(cur.right!=null)
				stack.push(cur.right);
			if (cur.left!=null) 
				stack.push(cur.left);
		}
	}
}

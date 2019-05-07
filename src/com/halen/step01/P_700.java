package com.halen.step01;

/**
 *       二叉搜索树中的搜索，LeetCode第700题
 * @author halen
 *
 */
public class P_700 {
	public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
        	return null;
        if(val == root.val)
        	return root;
        else if(val > root.val)
        	return searchBST(root.right, val);
        else
        	return searchBST(root.left, val);  
    }
}


class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	}
}